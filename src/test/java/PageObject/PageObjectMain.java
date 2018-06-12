package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageObjectMain {

    private SoftAssertions s = new SoftAssertions();

    private By openButton = By.xpath("//*[@class = 'section-first']//a[@title = 'Open account']");
    private By regForm = By.xpath("//*[@id = 'user-register-form']");
    private By firstName = By.xpath("//input[@name = 'firstName']");
    private By lastName = By.xpath("//input[@name = 'lastName']");
    private By email = By.xpath("//input[@name = 'email']");
    private By country = By.xpath("//select[@name = 'country']");
    private By phone = By.xpath("//input[@name = 'Phone']");
    private By submitButton = By.xpath("//input[@id = 'edit-submit']");
    private By cashier = By.xpath("//div[@class = 'wrap-content-pandats']");

    protected void BeforeTest() {
        Configuration.browser = "chrome";
        //Configuration.startMaximized = true;
        open("https://www.cryptomusu.com");
    }

    protected void goToRegisterForm() {
        $(openButton).click();
        $(regForm).should(Condition.exist);
    }

    protected void Registration() {
        $(firstName).setValue(randomfirstname);
        $(lastName).setValue(randomlastname);
        $(email).setValue(randomemail);
        $(country).selectOption("Sweden");
        $(phone).setValue(randomphone);
        $(submitButton).pressEnter();
    }

    protected void checkForCashier() {
        $(cashier).waitUntil(Condition.visible, 10000);
        s.assertThat($(cashier).getText()).isNotEmpty();
    }

    //Data for input field
    private final String randomfirstname = ("qa") + generateRandomString(12);
    private final String randomlastname = ("qa") + generateRandomString(8);
    private final String randomphone = generateRandomNumber(8);
    private final String randomemail = ("qa") + generateRandomString(15) + ("@gmail.com");

    //Generating random Strings
    private final String generateRandomString(int count) {
        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }
    private final String generateRandomNumber(int count) {
        String symbols = "0123456789";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }

}
