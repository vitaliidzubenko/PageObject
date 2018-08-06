package TestOptions;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class ApiOptions {
    protected final String APIKey = "api_key=3gGaWJ5XsrkOF7gx3qrg2Nhaw7iy8g4EjqYCbSQL";

    @BeforeTest(alwaysRun = true)
    public static void setup() {
        RestAssured.baseURI = "https://developers.ria.com/";
        RestAssured.port = 8080;
        RestAssured.basePath = "";
    }
}
