package SeleniumProject;

import org.openqa.selenium.WebDriver;
//Abstract class for ChromeFirefoxmanager
    /*hiyaraşinin en tepesinde bulunan sınıfın kendisinden türetilecek alt sınıflar
    için ortak arayüz(İnterface) görevi yapılması istenilir.bunun için oluşturulan metotlara ve sınıflara
    abstract class, abstract method denir. Kod tekrarını azaltır.Nesne üretemezler.
    önlerine abstract yazılarak soyutlaştırılırlar. Soyut methodlar override edilmelidir hata alınır
    static metotlar soyut tanımlanamaz
    private tanımlanamaz public ve protected tanımlanabilirler.
    soyut methodların göcdeleri bulunmaz.

    */
public abstract class DriverManager {

    protected WebDriver driver;
    protected abstract void createWebDriver();
    public void quitWebDriver(){
        if(null!=driver){
            driver.quit();
            driver=null;
        }
    }
    public WebDriver getWebDriver(){
        if(driver==null){
            createWebDriver();
        }
        return driver;
    }

}

