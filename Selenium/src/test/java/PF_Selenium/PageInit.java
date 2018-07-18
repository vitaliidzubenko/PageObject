package PF_Selenium;

import Selenium_Options.DriverInit;
import org.openqa.selenium.support.PageFactory;

public abstract class PageInit extends DriverInit {

    public PageInit() {
        PageFactory.initElements(getDriver(), this);
    }

}
