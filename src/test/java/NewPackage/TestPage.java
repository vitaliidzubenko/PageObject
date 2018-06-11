package NewPackage;

import org.testng.annotations.Test;

public class TestPage extends AnnotationsTest {

    protected MainPage mainPage = new MainPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected FinishPage finishPage = new FinishPage(driver);

    @Test
    public void Start() {
        driver.get("https://www.cryptomusu.com");
        mainPage.clickOnLoginButton();
        loginPage.fillingRegForm();
        finishPage.waitForFinshReg();

    }
}
