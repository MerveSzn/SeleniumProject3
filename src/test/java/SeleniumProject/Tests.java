package SeleniumProject;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

/*/
we’ll now create a test using one of the above DriverManager objects.
As you can see, the test writer doesn’t care whether the WebDriver for Chrome is called ChromeDriver or not.
They only need to specify the simple CHROME string (one of the values in the DriverType enum) when they need a Chrome browser instance.
 */
public class Tests {

    DriverManager driverManager;
    WebDriver driver;

    //we navigate to www.google.com and verify that the site’s title is named “Google.
    @Test
    public void navigateToGoogleTest(){

        //DrivermanagerFactory classından getDriverManager methodunu kullanrak enum ile chromedriverı aktive ederiz.
        driverManager =DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver =driverManager.getWebDriver();
        driver.get("www.google.com");
        Assert.assertEquals("Google",driver.getTitle());


        /*/
        By using this Factory design pattern, if there is a new requirement to run tests on a new browser, say Safari for example,
        it should not be a big deal. We just need to create a SafariDriverManger, which extends DriverManager exactly like the ChromeDriverManager we saw earlier.
        When it’s been created, test writers can simply create a SafariDriverManager using the new SAFARI value of the DriverType enum.
         */
    }
}
