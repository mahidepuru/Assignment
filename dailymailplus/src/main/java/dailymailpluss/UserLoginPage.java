package dailymailpluss;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 */
public class UserLoginPage  {
    public static void displaymenulist()  {
        List<WebElement> menus = Driver.driver.findElements(Selectors.MENULIST);
        for(WebElement menu : menus){
            System.out.println(menu.getText());
        }
    }
}
