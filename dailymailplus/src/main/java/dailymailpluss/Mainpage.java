package dailymailpluss;

import org.openqa.selenium.WebElement;

/**
 */
public class Mainpage {
    public static void clickonmyaccount(){
        WebElement myaccountbtn = Driver.driver.findElement(Selectors.MYACCOUNT);
        myaccountbtn.click(); }
    public static void enterusername(String username1){
        WebElement username = Driver.driver.findElement(Selectors.USERNAME);
         username.sendKeys(username1);
    }
    public static void enterpassword(String password1){
        WebElement password = Driver.driver.findElement(Selectors.PASSWORD);
        password.sendKeys(password1);

    }
    public static void clickonloginbutton(){
        WebElement loginbutton = Driver.driver.findElement(Selectors.LOGINBUTTON);
    loginbutton.click(); }
}
