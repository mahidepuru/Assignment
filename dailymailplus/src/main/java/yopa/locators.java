package yopa;

import org.openqa.selenium.By;

/**
 * Created by mahidhar on 17/06/16.
 */
public class locators {




    public static final  By postcodeTextbox = By.name("postcode");                                                                 //Re usable Elements //

    public static final By HouseNameTextbox = By.name("default_house_number");

    public static final By BooknowLink = By.id("postInfoAndAddress");
    public static final  By FirstBooking = By.id("postFirstBooking");
    public static final    By Fullname = By.name("full_name");

    public static final By SubmitButton = By.xpath("//button[@type='submit']");

    public static final By TelephoneNumber = By.name("telephone");

    public static final By EMail = By.name("email");

    public static final By SlideronConfirmationPage = By.cssSelector("button.slick-next.slick-arrow");

    public static final  By ClickOnPromotionLink = By.xpath("//form[@id='v3']/div[3]/div[2]/div/div[5]/div/div/a/span");

    public static final By DiscountcodeTextBox = By.id("discountcode");

}
