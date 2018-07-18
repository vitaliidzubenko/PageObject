package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuestionsPage extends DriverInit {
    private final Logger log = LogManager.getLogger(QuestionsPage.class);
    private final By inputBlock = By.xpath("//div[@class = 'container-content']//input[@class = 'flex']");
    private final By searchButton = By.xpath("//div[@class = 'container-content']//input[@class = 'button-search']");
    private final By searchLink = By.xpath("//div[@class = 'container-content']//a[contains (text(), 'Как зарегистрироваться')]");
    private final By answerContent = By.xpath("//div[@class = 'answer-list']");

    public QuestionsPage enterQuestion() {
        log.error("enterQuestion");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(inputBlock)).sendKeys("Как зарегистрироваться");
        getDriver().findElement(searchButton).click();
        return this;
    }

    public QuestionsPage clickAndView() {
        log.error("clickAndView");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(searchLink)).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(answerContent));
        return this;
    }

    public By getAnswerContent() {
        return answerContent;
    }
}
