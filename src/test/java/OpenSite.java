
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class OpenSite {

    @Disabled("Site")
    @Test
    public void openWeb(){
        // launch Chrome and direct it to the Base URL
        String url="https://sites.google.com/a/chromium.org/chromedriver/downloads";
        String path="C:\\Users\\merve.sozen\\Desktop\\Test\\chromedriver.exe";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-inforbars");
        File file = new File(path);
        if(file.exists()){
            options.addArguments("user-data-dir" +path);
        }
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.get(url);
        WebElement userName = driver.findElement(By.name("uid"));
        userName.click();
        userName.sendKeys("msozenth93@gmail.com");
    }

}
