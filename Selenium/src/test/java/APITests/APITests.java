package APITests;

import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class APITests extends APIanotation {
    private final Logger log = LogManager.getLogger(APITests.class);

    @Test(priority = 1)
    public void getTest() {
        log.error("Checking status code at HomePage");
        Response response = given().when().
                get("/car/used/");
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 2)
    public void getTime() {
        log.error("Getting time of response");
        Response response =
                get("/car/used/");
        long timeInSeconds = get().timeIn(TimeUnit.MILLISECONDS);
        System.out.println("Time is " + timeInSeconds + " MILLISECONDS");
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 3)
    public void get_params() {
        log.error("Verifiyng that body contains Audi after sending params");
        given().
                param("category_id", "1").
                param("marka_id", "6").
                param("model_id", "51").
                when().
                get().
                then().assertThat().
                statusCode(200).
                and().
                body(containsString("Audi")).
                body(containsString("A5"));
        System.out.println("Test finished");
    }

    @Test(priority = 4)
    public void watchResponse() {
        log.error("Viewing all content in response");
        Response response =
                when().
                        get("/car/used/").
                        then().
                        extract().response();
        String jsonAsString = response.prettyPrint();
        System.out.println(jsonAsString);
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 5)
    public void getData() {
        log.error("Opening sublink and check data in content");
        when().
                get("/car/used/").
                then().
                statusCode(200).
                and().assertThat().
                body(containsString("200 000+ объявлений о продаже авто с пробегом в Украине"));
        System.out.println("Test finished");
    }

    @Test(priority = 6)//TODO
    public void getBodyTest() {
        log.error("Sending parameters in JSON and checking status code");
        Response response =
                given().
                        config(RestAssuredConfig.newConfig().encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset("US-ASCII"))).
                        body("{'category_id':'1'," +
                                " 'marka_id':'6'," +
                                " 'model_id':'51'}").
                        when().
                        contentType(ContentType.JSON).
                                post();
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 7)//TODO
    public void getResponse() {
        log.error("Sending parameters and checking String in content");
        given().
                param("category_id", "1").
                param("marka_id", "6").
                param("model_id", "51").
                expect().
                body("brand", equalTo("Audi"));
        when().
                post().
                then().
                statusCode(200).
                log().status();
        System.out.println("Test finished");
    }

    @Test(priority = 8)//TODO
    public void redirectionTest() {
        log.error("Sending parameters at HomePage and check response at redirected page");
        Map<String, String> car = new HashMap<>();
        car.put("category_id", "1");
        car.put("marka_id", "6");
        car.put("model_id", "51");
        Response response =
                given()
                        .contentType("application/json")
                        .body(car)
                        .when()
                        .redirects().follow(true)
                        .post("/car/used/");
        System.out.println("Returned full html " + response.getStatusCode());
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    //TODO Mapa, OOP in mapa/ assert with comments
    //TODO testng files 2-3x for runing testscases

}
