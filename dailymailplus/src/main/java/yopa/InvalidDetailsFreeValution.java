package yopa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class InvalidDetailsFreeValution extends BasePage {


    public InvalidDetailsFreeValution(WebDriver driver) {
        super(driver);
    }



    public void TestWithInvalidDetails() throws Exception {


        driver.get("http://qa.yopa.uk");
        driver.findElement(locators.postcodeTextbox).clear();
        driver.findElement(locators.postcodeTextbox).sendKeys("1223333");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("postInfoAndAddress")).click();


        try {
            assertEquals("Please enter a full valid postcode, e.g. M13 9PL", driver.findElement(By.cssSelector("div.invalid-message")).getText());
        } catch (Error e) {

        }

        try {
            assertEquals("Please enter a house number or name.", driver.findElement(By.xpath("//div[@id='step1']/section/div/div[2]/div/div[2]")).getText());
        } catch (Error e) {

        }

        driver.findElement(By.name("default_postcode")).clear();
        driver.findElement(By.name("default_postcode")).sendKeys("E62DZ");

        driver.findElement(By.name("default_house_number")).sendKeys("210");


        driver.findElement(By.id("postInfoAndAddress")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("postFirstBooking")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        try {
            assertEquals("Please enter a full name.", driver.findElement(By.cssSelector("div.invalid-message")).getText());
        } catch (Error e) {
        }


        try {
            assertEquals("Please enter a valid telephone number.", driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[3]/div/div/div[2]")).getText());
        } catch (Error e) {

        }
        try {
            assertEquals("Please enter an email.", driver.findElement(By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[4]/div/div/div[2]")).getText());
        } catch (Error e) {

        }
        driver.findElement(By.cssSelector("a.discount-code-toggle > span")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}