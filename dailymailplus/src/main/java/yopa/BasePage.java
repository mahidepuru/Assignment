package yopa;
import org.openqa.selenium.WebDriver;

/**
 * Created by mahidhar on 18/06/16.
 */
public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}