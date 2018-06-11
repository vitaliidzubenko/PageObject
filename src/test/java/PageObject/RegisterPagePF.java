package PageObject;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static PageObject.Utils.generateRandomNumber;
import static PageObject.Utils.generateRandomString;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPagePF extends AbstractPage {

    private SoftAssertions s = new SoftAssertions();

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


    //Data for input field
    private final String randomfirstname = ("qa") + Utils.generateRandomString(12);
    private final String randomlastname = ("qa") + generateRandomString(8);
    private final String randomphone = generateRandomNumber(8);
    private final String randomemail = ("qa") + generateRandomString(15) + ("@gmail.com");

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
}
