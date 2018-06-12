package PageObject;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPage {

    private By openButton = By.xpath("//*[@class = 'section-first']//a[@title = 'Open account']");
    private By regForm = By.xpath("//*[@id = 'user-register-form']");

    protected void goToRegisterForm() {
        $(openButton).click();
        $(regForm).should(Condition.exist);
    }

}
