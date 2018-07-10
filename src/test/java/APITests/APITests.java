package APITests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class APITests extends APIanotation {

    @Test(priority = 1)
    public void getTest() {
        Response response = given().when().
                get();
        int code = response.getStatusCode();
        System.out.println("Response code is " + code);
        Assert.assertEquals(code, 200);
    }

    @Test(priority = 2)
    public void getWithBodyTest() {
        Response response =
                given().
                        body("{\"category_id\":\"1\", \"marka_id\":\"6\", \"model_id\":\"51\"}").
                        when().
                        contentType(ContentType.JSON).
                        post();
        System.out.println("Response code is " + response.asString());

    }

    @Test(priority = 3)
    public void getResponse() {
        given().
                param("category_id", "1").
                param("marka_id", "6").
                param("model_id", "51").
                when().
                get().
                then().log().status();

    }

    @Test(priority = 4)
    public void getTime() {
        long timeInSeconds = get().timeIn(TimeUnit.SECONDS);
        System.out.println(timeInSeconds);
    }


}
