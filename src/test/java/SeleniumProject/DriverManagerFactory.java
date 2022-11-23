package SeleniumProject;

//is a factory that manufactures Drivermanager objects
public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type){
        DriverManager driverManager;
        //since DriverManager is abstract class,just recieve its implemantations such as ChromeDriverManager
        //How to implement DriverManagerFactory class
        switch (type){
            case CHROME:
                driverManager= new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager= new FireFoxDriverManager();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return driverManager;
    }
}
