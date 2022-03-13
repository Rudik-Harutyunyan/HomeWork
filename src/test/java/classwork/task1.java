package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class task1 {
    public static void main(String[] args) {

    }


    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement customerFormField = driver.findElement(By.name("cusid"));
        customerFormField.sendKeys("asdasd");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();
    }

    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement customerFormField = driver.findElement(By.name("cusid"));
        customerFormField.sendKeys("asdasd");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.quit();

    }
    @Test
    public void thirdTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement option1 = driver.findElement(By.id("vfb-7-1"));
        WebElement option2 = driver.findElement(By.id("vfb-7-2"));
        WebElement option3 = driver.findElement(By.id("vfb-7-3"));
        List<WebElement> elementsList = new ArrayList<>();
        elementsList.add(option1);
        elementsList.add(option2);
        elementsList.add(option3);
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.contains(option3)){
                option3.click();
            }
        }
    }
}
