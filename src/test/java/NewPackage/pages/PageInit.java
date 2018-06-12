package NewPackage.pages;

import NewPackage.Other.DriverInit;
import org.openqa.selenium.support.PageFactory;

public abstract class PageInit extends DriverInit {

    public PageInit() {
        PageFactory.initElements(getDriver(), this);
    }

}
