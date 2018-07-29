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
import static org.hamcrest.CoreMatchers.*;

public class APITests extends APIanotation {
    private final Logger log = LogManager.getLogger(APITests.class);

    @Test(priority = 1)
    public void getStatusCode() {
        log.error("Checking status code");
        Response response = given().when().
                get();
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 2)
    public void getResponseTime() {
        log.error("Getting time of response");
        long timeInSeconds = get().timeIn(TimeUnit.MILLISECONDS);
        System.out.println("Time of response is " + timeInSeconds + " MILLISECONDS");
        System.out.println("Test finished");
    }

    @Test(priority = 3)
    public void getCity() {
        log.error("Verifying that body contains City after sending params");
        given().
                when().
                get("/auto/states/1/cities?api_key=3gGaWJ5XsrkOF7gx3qrg2Nhaw7iy8g4EjqYCbSQL").
                then().
                assertThat().body("name", hasItem("Винница"));
        System.out.println("Test finished");
    }

    @Test(priority = 4)
    public void getMarks() {
        log.error("Verifying that body contains Marks after sending params");
        given().
                when().
                get("auto/categories/1/marks?api_key=3gGaWJ5XsrkOF7gx3qrg2Nhaw7iy8g4EjqYCbSQL").
                then().
                assertThat().body("name", hasItem("Audi"));
        System.out.println("Test finished");
    }

    @Test//TODO
    public void get_params() {
        log.error("Verifying that body contains Audi after sending params");
        given().
                param("bodystyle[0]", "3").
                param("marka_id", "6").
                param("model_id[0]", "0").
                param("s_yers[0]", "2010").
                param("po_yers[0]", "2017").
                when().
                get("auto/search?api_key=3gGaWJ5XsrkOF7gx3qrg2Nhaw7iy8g4EjqYCbSQL").
                then().assertThat().
                statusCode(200);
        System.out.println("Test finished");
    }

    @Test
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

    @Test
    public void getData() {
        log.error("Opening sublink and check data in content");
        when().
                get().
                then().
                statusCode(200).
                and().assertThat().
                body(containsString("200 000+ объявлений о продаже авто с пробегом в Украине"));
        System.out.println("Test finished");
    }

    @Test//TODO
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

    //TODO Mapa, OOP in mapa/ assert with comments
    //TODO testng files 2-3x for runing testscases

}
