package yopa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class YopaTestSuite {


    private WebDriver driver;


    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

@Before
    public void setUp() throws Exception {



        driver = new ChromeDriver();


      driver.get("http://qa.yopa.uk");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}

@Test

public void TestWithValidDetails() throws Exception {


    FreeValutionForm userflow = new FreeValutionForm(driver);

//    userflow.LondonPropertyWithValidDetails();
  //  userflow.StaffordshirePropertyWithValidDetails();
    //userflow.WithValidDetailsApplyPromotionCode();
    userflow.WithvalidDetailsUserSelectedDate();

}
@Test
    public void TestWithInvalidDetails() throws Exception{

        InvalidDetailsFreeValution userflow = new InvalidDetailsFreeValution(driver);

        userflow.TestWithInvalidDetails();




    }
    /*
    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString))
            fail(verificationErrorString);
    }
    */
}

