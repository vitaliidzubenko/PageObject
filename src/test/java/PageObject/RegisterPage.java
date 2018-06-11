package PageObject;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static PageObject.Utils.generateRandomNumber;
import static PageObject.Utils.generateRandomString;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends AbstractPage {

    private SoftAssertions s = new SoftAssertions();

    private By firstName = By.xpath("//input[@name = 'firstName']");
    private By lastName = By.xpath("//input[@name = 'lastName']");
    private By email = By.xpath("//input[@name = 'email']");
    private By country = By.xpath("//select[@name = 'country']");
    private By phone = By.xpath("//input[@name = 'Phone']");
    private By submitButton = By.xpath("//input[@id = 'edit-submit']");
    private By cashier = By.xpath("//div[@class = 'wrap-content-pandats']");

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
