package dailymailpluss;

import org.junit.Assert;

/**
 */
public class ImageUpload {
    public static void uploadanimage(){

        Driver.driver.findElement(Selectors.IMAGEUPLOADBTN).sendKeys("/home/mahidhar/Downloads/logo.jpg");
    }
    public static void isimagesuccessfullyuploaded(){
        Driver.driver.findElement(Selectors.IMAGESUBMITBTN).click();
        Assert.assertEquals("Upload complete", Driver.driver.findElement(Selectors.SUCCESSFULMSG).getText());
        try {
            Assert.assertEquals("Upload complete", Driver.driver.findElement(Selectors.SUCCESSFULMSG).getText());
        } catch (Error e) {
            //verificationErrors.append(e.toString());
        }
    }
}
