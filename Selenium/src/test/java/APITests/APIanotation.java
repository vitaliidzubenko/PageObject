package APITests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class APIanotation {

    @BeforeTest(alwaysRun = true)
    public static void setup() {
        RestAssured.baseURI = "https://developers.ria.com/";
        RestAssured.port = 8080;
        RestAssured.basePath = "";
    }
}
