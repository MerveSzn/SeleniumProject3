package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        //instantiate a new Chromedriver with set of oprtions
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        this.driver= new FirefoxDriver((FirefoxOptions) driver);
    }
}
