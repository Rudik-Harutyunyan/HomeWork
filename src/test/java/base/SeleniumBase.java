package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class SeleniumBase {

    public WebDriver driver;
    private String baseUrl = "http://demo.guru99.com";
    private String baseUrl1 = "https://www.google.com";
    private String baseUrl2 = "http://automationexercise.com";
    private String baseUrl3 = "https://rahulshettyacademy.com/AutomationPractice/";
    private String baseUrl4 = "https://www.saucedemo.com/";

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBaseUrl1() {
        return baseUrl1;
    }

    public String getBaseUrl2() {
        return baseUrl2;
    }

    public String getBaseUrl3() {
        return baseUrl3;
    }

    public String getBaseUrl4() {
        return baseUrl4;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Desktop\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.getLogLevel();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();

    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}