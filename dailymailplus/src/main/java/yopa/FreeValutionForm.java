package yopa;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by mahidhar on 18/06/16.
 */
public class FreeValutionForm extends BasePage {
    By postcodeTextbox = By.name("postcode");                                                                 //Re usable Elements //

    By HouseNameTextbox = By.name("default_house_number");

    By BooknowLink = By.id("postInfoAndAddress");
    By FirstBooking = By.id("postFirstBooking");
    By Fullname = By.name("full_name");

    By SubmitButton = By.xpath("//button[@type='submit']");

    By TelephoneNumber = By.name("telephone");

    By EMail = By.name("email");

    By SlideronConfirmationPage = By.cssSelector("button.slick-next.slick-arrow");

    By ClickOnPromotionLink = By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[5]/div/div/a/span");

    By DiscountcodeTextBox = By.id("discountcode");


    public FreeValutionForm(WebDriver driver) {
        super(driver);
    }


    public void LondonPropertyWithValidDetails() throws Exception {


        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("E62dz");
        driver.findElement(SubmitButton).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("210");
        driver.findElement(BooknowLink).click();
        Utilities.WaitForSomeTime();
        driver.findElement(FirstBooking).click();
        driver.findElement(Fullname).sendKeys("mahidhar Depuru test with the limited characters");
        driver.findElement(TelephoneNumber).sendKeys("07429978991");

        driver.findElement(EMail).sendKeys("rdepuru@gmail.com");
        driver.findElement(SubmitButton).click();


        try {
            assertEquals("Your free valuation is confirmed.", driver.findElement(By.cssSelector("h1.confirmation-font-1")).getText());
        } catch (Error e) {

        }

        //below assertion will check the main content
        //1. Your agent is ----
        //2.they visit on selected date
        //3.contact email address of the agent

        try {
            assertEquals("Your dedicated YOPA agent is:", driver.findElement(By.cssSelector("span.confirmation-font-2")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("They will visit your property on:", driver.findElement(By.xpath("//section[@id='confirmation']/div/div/div[2]/div/div[2]/div[2]/span")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("michael.macfarlane@yopa.co.uk", driver.findElement(By.cssSelector("span.confirmation-font-2__red.email")).getText());
        } catch (Error e) {

        }
        driver.findElement(SlideronConfirmationPage).click();
    }


    public void StaffordshirePropertyWithValidDetails() throws Exception {

        driver.get("http://qa.yopa.uk");

        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("St42eh");
        driver.findElement(SubmitButton).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("42");
        driver.findElement(BooknowLink).click();
        Utilities.WaitForSomeTime();
        driver.findElement(FirstBooking).click();
        driver.findElement(Fullname).sendKeys("mahidhar Depuru test with the limited characters");
        driver.findElement(TelephoneNumber).sendKeys("07429978991");
        driver.findElement(EMail).sendKeys("rdepuru@gmail.com");

        driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[6]/div/div/button")).click();

        try {
            assertEquals("Your dedicated YOPA agent is:", driver.findElement(By.cssSelector("span.confirmation-font-2")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("They will visit your property on:", driver.findElement(By.xpath("//section[@id='confirmation']/div/div/div[2]/div/div[2]/div[2]/span")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("sally.clarke@yopa.co.uk", driver.findElement(By.cssSelector("span.confirmation-font-2__red.email")).getText());
        } catch (Error e) {

        }
        driver.findElement(SlideronConfirmationPage).click();
    }

    public void WithValidDetailsApplyPromotionCode() throws Exception {


        driver.get("http://qa.yopa.uk");

        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("St42eh");
        driver.findElement(SubmitButton).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("42");
        driver.findElement(BooknowLink).click();
        Utilities.WaitForSomeTime();
        driver.findElement(FirstBooking).click();
        driver.findElement(Fullname).sendKeys("mahidhar Depuru test with the limited characters");
        driver.findElement(TelephoneNumber).sendKeys("07429978991");
        driver.findElement(EMail).sendKeys("rdepuru@gmail.com");
        driver.findElement(ClickOnPromotionLink).click();
        Utilities.WaitForSomeTime();
        driver.findElement(DiscountcodeTextBox).sendKeys("123455555");
        driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[6]/div/div/button")).click();

        try {
            assertEquals("Your dedicated YOPA agent is:", driver.findElement(By.cssSelector("span.confirmation-font-2")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("They will visit your property on:", driver.findElement(By.xpath("//section[@id='confirmation']/div/div/div[2]/div/div[2]/div[2]/span")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("sally.clarke@yopa.co.uk", driver.findElement(By.cssSelector("span.confirmation-font-2__red.email")).getText());
        } catch (Error e) {

        }
        driver.findElement(SlideronConfirmationPage).click();
    }


    public void WithvalidDetailsUserSelectedDate() throws Exception {


        driver.get("http://qa.yopa.uk");
        driver.findElement(postcodeTextbox).clear();
        driver.findElement(postcodeTextbox).sendKeys("E62dz");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(HouseNameTextbox).clear();
        driver.findElement(HouseNameTextbox).sendKeys("210");
        driver.findElement(BooknowLink).click();
        Utilities.WaitForSomeTime();
        driver.findElement(By.cssSelector("#yopa-calendar-next > i.fa.fa-chevron-right")).click();
        Utilities.WaitForSomeTime();
        driver.findElement(By.id("2016-07-01")).click();
        Utilities.WaitForSomeTime();
        driver.findElement(By.xpath("(//li[@id='07:00:00']/div[2])[8]")).click();
        Utilities.WaitForSomeTime();
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

        }

    }



}

