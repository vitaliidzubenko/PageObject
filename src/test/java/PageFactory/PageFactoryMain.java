package PageFactory;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class PageFactoryMain {

    private SoftAssertions s = new SoftAssertions();

    @FindBy(xpath = "//*[@class = 'section-first']//a[@title = 'Open account']")
    private WebElement openButton;
    @FindBy(xpath = "//*[@id = 'user-register-form']")
    private WebElement regForm;
    @FindBy(xpath = "//input[@name = 'firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name = 'lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement email;
    @FindBy(xpath = "//select[@name = 'country']")
    private WebElement country;
    @FindBy(xpath = "//input[@name = 'Phone']")
    private WebElement phone;
    @FindBy(xpath = "//input[@id = 'edit-submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class = 'wrap-content-pandats']")
    private WebElement cashier;

    protected void BeforeTest() {
        Configuration.browser = "chrome";
        open("https://www.cryptomusu.com");
//        PageFactory.initElements(getWebDriver(), this);

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
