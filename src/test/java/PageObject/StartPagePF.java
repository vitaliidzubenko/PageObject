package PageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class StartPagePF {

    @FindBy(xpath = "//*[@class = 'section-first']//a[@title = 'Open account']")
    private WebElement openButton;
    @FindBy(xpath = "//*[@id = 'user-register-form']")
    private WebElement regForm;

    protected RegisterPagePF goToRegisterForm() {
        $(openButton).click();
        $(regForm).should(Condition.exist);
        return page(RegisterPagePF.class);
//      SelenidePageFactory.initElements(new SelenideFieldDecorator(WebDriverRunner.getWebDriver()), RegisterPagePF.class);
    }

}
