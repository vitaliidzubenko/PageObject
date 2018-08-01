package PagesRia;

import BddOptions.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuestionsPage extends DriverInit {
    private final Logger log = LogManager.getLogger(QuestionsPage.class);
    private final By inputBlock = By.xpath("//input[@name= 'question']");
    private final By searchButton = By.xpath("//button[@class = 'btn-send no-style']");
    private final By searchLink = By.xpath("//a[contains (text(), 'Как зарегистрироваться')]");
    private final By answerContent = By.xpath("//div[@class = 'answer-list']");

    public QuestionsPage enterQuestion() {
        log.error("enterQuestion");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(inputBlock)).sendKeys("Как зарегистрироваться");
        getDriver().findElement(searchButton).click();
        return this;
    }

    public QuestionsPage clickLink() {
        log.error("clickLink");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(searchLink)).click();
        return this;
    }

    public QuestionsPage viewLink() {
        log.error("viewLink");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(answerContent));
        return this;
    }

    public By getAnswerContent() {
        return answerContent;
    }
}
