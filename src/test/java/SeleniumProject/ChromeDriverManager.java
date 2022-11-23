package SeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager {
    @Override
    public void createWebDriver() {

        //instantiate a new Chromedriver with set of oprtions
        String path="C:\\Users\\merve.sozen\\Desktop\\Test\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options= new ChromeOptions();
        options.addArguments("disable-inforbars");
        options.addArguments("--start-maximized");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    }


}
