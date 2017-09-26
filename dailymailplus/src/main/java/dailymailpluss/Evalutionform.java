package dailymailpluss;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Evalutionform {
    By postcodeTextbox = By.name("postcode");

    By HouseNameTextbox = By.name("default_house_number");

    By BooknowLink = By.id("postInfoAndAddress");

    By FirstBooking = By.id("postFirstBooking");

    By Fullname = By.name("full_name");

    By TelephoneNumber = By.name("telephone");

    By EMail = By.name("email");

   By HomeButton = By.xpath("//header[@id='masthead']/div/div/div/div");

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "/home/mahidhar/Desktop/chromedriver/chromedriver.exe");
        driver  = new ChromeDriver();
        //driver = new FirefoxDriver();
        baseUrl = "http://qa.yopa.uk/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void PositiveTest() throws Exception {
//book now link leads to the user details

        driver.get(baseUrl + "/");
        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("E62dz");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("210");
        driver.findElement(BooknowLink).click();
        Thread.sleep(2000);
        driver.findElement(FirstBooking).click();

        driver.findElement(Fullname).sendKeys("mahidhar Depuru test with the limited characters");


        driver.findElement(TelephoneNumber).sendKeys("07429978991");

        driver.findElement(EMail).sendKeys("rdepuru@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            assertEquals("Your dedicated YOPA agent is:", driver.findElement(By.cssSelector("span.confirmation-font-2")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("They will visit your property on:", driver.findElement(By.xpath("//section[@id='confirmation']/div/div/div[2]/div/div[2]/div[2]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("michael.macfarlane@yopa.co.uk", driver.findElement(By.cssSelector("span.confirmation-font-2__red.email")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

    }
        /* try {
            assertEquals("Your free valuation is confirmed.", driver.findElement(By.cssSelector("h1.confirmation-font-1")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


        //select the calender and verify the user interaction , then submit the user details
        driver.get(baseUrl + "/");
        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("E62dz");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("210");
        driver.findElement(BooknowLink).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//ul[@id='2016-06-20']/div[2]")).click();
        driver.findElement(By.cssSelector("#yopa-calendar-next > i.fa.fa-chevron-right")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='yopa-calendar-prev']/i")).click();

//        driver.findElement(By.cssSelector("html.wf-soleil-n3-active.wf-soleil-n4-active.wf-soleil-n6-active.wf-soleil-n7-active.wf-active body#property-valuation div.default-container div.container.valuationV3 div.row div.col-sm-12 form#v3.validate-form div.row div.col-xs-12 div#step2.booking-calendar div.row div.col-xs-12.col-md-7 div.step div.valuation--content div.row div div.carousel-container div#carousel.yopa-calendar-el div.yopa-calendar-appointments ul#2016-06-22-appointments.yopa-calendar-date-appointment-list li#09:00:00.yopa-calendar-date-appointment div.col-xs-9.col-sm-9.information")).click();

        driver.findElement(By.id("postOtherBooking")).click();

        driver.findElement(Fullname).sendKeys("mahidhar Depuru test with the limited characters");

        driver.findElement(TelephoneNumber).clear();
        driver.findElement(TelephoneNumber).sendKeys("07429978991");
        driver.findElement(EMail).clear();
        driver.findElement(EMail).sendKeys("rdepuru@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertEquals("Your free valuation is confirmed.", driver.findElement(By.cssSelector("h1.confirmation-font-1")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


    }
    */
@Test

public void Negativescenario()throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(postcodeTextbox).clear();
    driver.findElement(postcodeTextbox).sendKeys("1223333");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.id("postInfoAndAddress")).click();


    try {
        assertEquals("Please enter a full valid postcode, e.g. M13 9PL", driver.findElement(By.cssSelector("div.invalid-message")).getText());
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }

    try {
        assertEquals("Please enter a house number or name.", driver.findElement(By.xpath("//div[@id='step1']/section/div/div[2]/div/div[2]")).getText());
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }

    driver.findElement(By.name("default_postcode")).clear();
    driver.findElement(By.name("default_postcode")).sendKeys("E62DZ");

    driver.findElement(By.name("default_house_number")).sendKeys("210");
    /*
    driver.findElement(By.id("postInfoAndAddress")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("postFirstBooking")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();



    for (int second = 0;; second++) {
        if (second >= 60) fail("timeout");
        try { if ("Please enter a full name.".equals(driver.findElement(By.cssSelector("div.invalid-message")).getText())) break; } catch (Exception e) {}
        Thread.sleep(1000);
    }

    try {
        assertEquals("Please enter a valid telephone number.", driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[3]/div/div/div[2]")).getText());
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }
    try {
        assertEquals("Please enter an email.", driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[4]/div/div/div[2]")).getText());
    } catch (Error e) {
        verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("a.discount-code-toggle > span")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();



}

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }

    */
}
}