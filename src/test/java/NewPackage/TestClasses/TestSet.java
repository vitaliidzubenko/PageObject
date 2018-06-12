package NewPackage.TestClasses;

import NewPackage.Other.AnnotationsTest;
import NewPackage.pages.FinishPage;
import NewPackage.pages.LoginPage;
import NewPackage.pages.MainPage;
import org.testng.annotations.Test;

public class TestSet extends AnnotationsTest {

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
