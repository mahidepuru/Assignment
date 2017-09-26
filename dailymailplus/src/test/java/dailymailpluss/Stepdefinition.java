package dailymailpluss;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Stepdefinition {
    @Before
    public static void openbrowser(){
        Driver.driver = new ChromeDriver();

    }
    @After
    public static void closebrowser(){
        Driver.driver.quit();

    }

    @Given("^i am in dailymailplus homepage$")
    public void i_am_in_dailymailplus_homepage() throws Throwable {
     Driver.driver.get(Selectors.URL);    }

    @When("^i enter username as '(.+)' and password as '(.+)'$")
    public void i_enter_username_as_dmgtesters_gmail_com_and_password_as_Technical_(String username,String password) throws Throwable {
    Mainpage.clickonmyaccount();
    Mainpage.enterusername(username);
    Mainpage.enterpassword(password);
    Mainpage.clickonloginbutton();}

    @Then("^it should display following  Personal Details tab,Payment Details tab,Help tab,Issues tab")
    public void i_should_see_successful_login_message() throws Throwable {
        UserLoginPage.displaymenulist();
    }
    @Given("^i am on imageupload main page$")
    public void i_am_on_imageupload_main_page() throws Throwable {
Driver.driver.get(Selectors.URL1);    }

    @When("^i click on upload file$")
    public void i_click_on_upload_file() throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

    @When("^select image to upload$")
    public void select_image_to_upload() throws Throwable {
ImageUpload.uploadanimage();    }

    @Then("^i should successfully upload an image$")
    public void i_should_successfully_upload_an_image() throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

}
