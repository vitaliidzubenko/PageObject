package PagesRia;

import BddOptions.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class OtherRiaSites extends DriverInit {
    private final Logger log = LogManager.getLogger(OtherRiaSites.class);
    private final By contentHeaderLinks = By.xpath("//div[@class = 'container-header']");

    public void compareLinks(String trueLink) {
        String actualLink = getDriver().getCurrentUrl();
        if (trueLink.equals(actualLink)) {
            System.out.println("Current Link " + trueLink + " is RIGHT: " + actualLink);
        } else
            System.out.println("Current Link " + trueLink + " is WRONG: " + actualLink);
    }

    //TODO Optimize switching to windows
    public void switchToWindow() {
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
    }

    public void switchbackToWindow() {
        String parentWindow = getDriver().getWindowHandle();
        getDriver().close();
        getDriver().switchTo().window(parentWindow);

    }

    public OtherRiaSites checkRiaCom() {
        log.error("checkRiaCom");
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);

                getWait().until(ExpectedConditions.visibilityOfElementLocated(contentHeaderLinks));

                compareLinks("https://www.ria.com/");
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
            }
        }
        return this;
    }

    public OtherRiaSites checkRealty() {
        log.error("checkRealty");
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);

                getWait().until(ExpectedConditions.visibilityOfElementLocated(contentHeaderLinks));

                compareLinks("https://dom.ria.com/");
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
            }
        }
        return this;
    }

    public OtherRiaSites checkCarGoods() {
        log.error("checkCarGoods");
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);

                getWait().until(ExpectedConditions.visibilityOfElementLocated(contentHeaderLinks));

                compareLinks("https://market.ria.com/");
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
            }
        }
        return this;
    }

    public OtherRiaSites checkAutoParts() {
        log.error("checkAutoParts");
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);

                getWait().until(ExpectedConditions.visibilityOfElementLocated(contentHeaderLinks));

                compareLinks("https://zapchasti.ria.com/");
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
            }
        }
        return this;
    }

    public By getContentHeaderLinks() {
        return contentHeaderLinks;
    }
}
