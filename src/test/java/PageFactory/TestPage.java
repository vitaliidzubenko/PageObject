package PageFactory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPage extends PageFactoryMain {

    @BeforeTest
    public void BeforeTesting() {
        super.BeforeTest();
    }

    @AfterTest
    public void Finish() {
        System.out.println("***End of test");
    }

    @Test
    public void testSelenide() {
        super.goToRegisterForm();
        super.Registration();
        super.checkForCashier();
    }

}
