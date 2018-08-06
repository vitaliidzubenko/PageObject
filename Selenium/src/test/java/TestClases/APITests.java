package TestClases;

import TestOptions.ApiOptions;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

public class APITests extends ApiOptions {
    private final Logger log = LogManager.getLogger(APITests.class);

    @Test(priority = 1)
    public void getStatusCode() {
        log.error("Checking status code at AutoRia");
        Response response =
                given().
                        when().get();
        int code = response.getStatusCode();
        System.out.println("Status code is " + code);
        Assert.assertEquals(code, 200, "***Verification failed***");
        System.out.println("Test finished");
    }

    @Test(priority = 2)
    public void getResponseTime() {
        log.error("Getting time of response at AutoRia");
        long timeInSeconds = get().timeIn(TimeUnit.MILLISECONDS);
        System.out.println("Time of response is " + timeInSeconds + " MILLISECONDS");
        System.out.println("Test finished");
    }

    @Test(priority = 3)
    public void getCity() {
        log.error("Verifying that body contains Cities in Vinnitsa Region after sending params");
        given().
                when().
                get("auto/states/1/cities?" + APIKey).
                then().
                assertThat().body("name", hasItem("Винница")).
                assertThat().body("name", hasItem("Немиров")).
                assertThat().body("name", hasItem("Тульчин"));
        System.out.println("Test finished");
    }

    @Test(priority = 4)
    public void getTypTran() {
        log.error("Verifying that body contains Types of Transport after sending params");
        given().
                when().
                get("auto/categories/?" + APIKey).
                then().
                assertThat().body("value", hasItems(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Test finished");
    }

    @Test(priority = 5)
    public void getMarks() {
        log.error("Verifying that body contains Marks after sending params");
        given().
                when().
                get("auto/categories/1/marks?" + APIKey).
                then().
                assertThat().body("name", hasItem("Audi")).
                assertThat().body("name", hasItem("Bentley")).
                assertThat().body("name", hasItem("BMW")).
                assertThat().body("name", hasItem("Bugatti")).
                assertThat().body("name", hasItem("Chevrolet"));
        System.out.println("Test finished");
    }

    @Test(priority = 6)
    public void getModels() {
        log.error("Verifying that body contains Ferrari models after sending params");
        given().
                when().
                get("auto/categories/1/marks/22/models/_group?" + APIKey).
                then().
                assertThat().body("name", hasItem("LaFerrari")).
                assertThat().body("name", hasItem("Mondial")).
                assertThat().body("name", hasItem("Testarossa")).
                assertThat().body("name", hasItem("Scuderia Spider 16M Convertible")).
                assertThat().body("name", hasItem("California")).
                assertThat().body("name", hasItem("458 Italia"));
        System.out.println("Test finished");
    }

    @Test(priority = 7)
    public void getSearch() {
        log.error("Displaying request body at Search service for Audi Q8 2010-2017 in Vinnitsa");
        Response response =
                given().log().all().
                        param("marka_id", "6").
                        param("model_id", "54663").
                        param("s_yers", "2010").
                        param("po_yers", "2017").
                        param("city", "1").
                        when().
                        get("auto/search?" + APIKey);
        String body = response.prettyPrint();
        int code = response.getStatusCode();
        System.out.println(body);
        System.out.println("Test finished" + " and status code is " + code);
    }

    @Test(priority = 8)
    public void getAveragePrice() {
        log.error("Displaying average price for Ford Focus 2012-2018 in Vinnitsa");
        Response response =
                given().log().all().
                        param("marka_id", "24").
                        param("model_id", "240").
                        param("s_yers", "2012").
                        param("po_yers", "2018").
                        param("city", "1").
                        when().
                        get("auto/average_price?" + APIKey);
        String body = response.prettyPrint();
        int code = response.getStatusCode();
        System.out.println(body);
        System.out.println("Test finished" + " and status code is " + code);
    }

    @Test(priority = 9)
    public void getInfo() {
        log.error("Displaying info by autoID after sending params");
        Response response =
                given().
                        param("auto_id", "19050985").
                        when().
                        get("auto/info?" + APIKey);
        String body = response.prettyPrint();
        System.out.println(body);
        System.out.println("Test finished");
    }

    @Test(priority = 10)
    public void getOptions() {
        log.error("Verifying that body contains options after sending params");
        given().
                when().
                get("/auto/categories/1/options?" + APIKey).
                then().
                assertThat().body("name", hasItem("ABS")).
                assertThat().body("name", hasItem("ABD")).
                assertThat().body("name", hasItem("Пневмоподвеска"));
        System.out.println("Test finished");
    }

}
