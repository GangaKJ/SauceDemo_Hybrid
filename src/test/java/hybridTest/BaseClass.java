package hybridTest; 

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import fileread_utlity.ReadConfigFile;

public class BaseClass {
    public WebDriver driver;
    public String base_url;
    public String user;
    public String pwd;
    ReadConfigFile rcf;

    @BeforeClass
    public void Launchwebsite() {
        // Initialize the ReadConfigFile instance
        rcf = new ReadConfigFile();
        
        // Setting property for Firefox driver. Specify the path where geckodriver executable is located
        System.setProperty("webdriver.gecko.driver", "D:\\Entri_seleniumbinaries\\Browserbinaries\\Geckodriver\\geckodriver.exe");
        
        // Initialize WebDriver object
        driver = new FirefoxDriver();
        
        // Get properties after initialization
        base_url = rcf.geturl();
        user = rcf.user_name();
        pwd = rcf.pass_word();
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Navigate to the base URL
        driver.get(base_url);
    }

    @AfterClass
    public void closewebsite() {
        driver.quit();
    }
}
