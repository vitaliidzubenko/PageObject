package PageObject;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectTest {

    @BeforeTest
    public void BeforeTesting() {
        Configuration.browser = "chrome";
        //Configuration.startMaximized = true;
//        open("https://www.cryptomusu.com");
    }

    @AfterTest
    public void Finish(){
        System.out.println("***End of test");
    }

    @Test
    public void TestingPage() {
//        Browser.getDriver().findElement().click();

//        StartPage startPage = new StartPage();
        //TODO use selenium page factory

        StartPagePF startPagePF = open("https://www.cryptomusu.com", StartPagePF.class);
//        startPagePF.goToRegisterForm();

        RegisterPagePF registerPage = startPagePF.goToRegisterForm();

//        RegisterPage registerPage = new RegisterPage();
        registerPage.Registration();
        registerPage.checkForCashier();
    }

}
