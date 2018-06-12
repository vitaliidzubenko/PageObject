package PF_Selenide;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

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
}
