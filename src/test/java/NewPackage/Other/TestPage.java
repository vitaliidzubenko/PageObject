package NewPackage.Other;

import org.testng.annotations.Test;

public class TestPage extends AnnotationsTest {

    protected MainPage mainPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    protected FinishPage finishPage = new FinishPage();

    @Test
    public void Start() {
        getDriver().get("https://www.cryptomusu.com");
        mainPage.clickOnLoginButton();
        loginPage.fillingRegForm();
        finishPage.waitForFinshReg();

    }
}
