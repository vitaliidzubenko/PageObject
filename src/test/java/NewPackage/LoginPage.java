package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends DriverInit {

    protected DataForInput Input = new DataForInput();

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

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillingRegForm() {
        wait.until(ExpectedConditions.visibilityOf(regForm));
        firstName.sendKeys(Input.randomfirstname);
        lastName.sendKeys(Input.randomlastname);
        email.sendKeys(Input.randomemail);
        //Selecting the country from dropdown
        WebElement SelCount = country;
        Select dropdown = new Select(SelCount);
        dropdown.selectByVisibleText("Sweden");
        phone.sendKeys(Input.randomphone);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }
}
