package APITests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class APITests extends APIanotation {

    @Test(priority = 1)//Status code at HomePage
    public void getTest() {
        Response response = given().when().
                get("/car/used/");
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200);
    }

    @Test(priority = 2)//Sending params in JSON and checking status code
    public void getBodyTest() {
        Response response =
                given().
                        body("{\"category_id\":\"1\"," +
                                " \"marka_id\":\"6\"," +
                                " \"model_id\":\"51\"}").
                        when().
                        contentType(ContentType.JSON).
                        post();
        System.out.println("Response code is " + response.asString());
    }

    @Test(priority = 3)// Sending params and checking String in content
    public void getResponse() {
        given().
                param("category_id", "1").
                param("marka_id", "6").
                param("model_id", "51").
                when().
                get().
                then().statusCode(200).
                log().status().
                body(containsString("Audi"));
    }

    @Test(priority = 4)// Opening subLink and check data in content
    public void getData() {
        when().
                get("/car/used/").
                then().
                statusCode(200).
                body(containsString("200 000+ объявлений о продаже авто с пробегом в Украине")).
                body("app-content", notNullValue());
    }

    @Test(priority = 5)//TODO send params at HomePage and check response in redirected page
    public void redirectionTest() {
        Map<String, String> car = new HashMap<>();
        car.put("category_id", "1");
        car.put("marka_id", "6");
        car.put("model_id", "51");

        given()
                .contentType("application/json")
                .body(car)
                .when().post("/car/used/").then()
                .body("empty", equalTo(false))
                .statusCode(200);
    }

    @Test(priority = 6)//Viewing all content in response
    public void watchResponse() {
        Response response =
                when().
                        get("/car/used/").
                        then().
                        extract().response();
        String jsonAsString = response.prettyPrint();
        System.out.println(jsonAsString);
    }

    @Test(priority = 7)//Get time of response
    public void getTime() {
        get();
        long timeInSeconds = get().timeIn(TimeUnit.SECONDS);
        System.out.println(timeInSeconds);

    }
}
