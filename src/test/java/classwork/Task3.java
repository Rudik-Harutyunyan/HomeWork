package classwork;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.plaf.basic.BasicBorders;

public class Task3 {
    @Test
    public void classwork(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
        if (driver.findElement(By.cssSelector("#header > div")).isDisplayed()){
            System.out.println("VISIBLE");
        }else {
            System.out.println("not visible");
        }
        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")).click();
        if (driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > h2")).isDisplayed()){
            System.out.println("Visible");
        }else System.out.println("not selected");
        driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)")).sendKeys("Rudik");
        driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")).sendKeys("kllkllkl@gmail.com");
        driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button")).click();
        if (driver.findElement(By.cssSelector("#form > div > div > div > div > h2 > b")).isDisplayed()){
            System.out.println("Visible");
        }else System.out.println("not visible");
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        Select selectDay = new Select(driver.findElement(By.cssSelector("#days")));
        selectDay.selectByVisibleText("10");
        Select selectMonth = new Select(driver.findElement(By.cssSelector("#months")));
        selectMonth.selectByVisibleText("February");
        Select selectYear = new Select(driver.findElement(By.cssSelector("#years")));
        selectYear.selectByVisibleText("1995");
        driver.findElement(By.cssSelector("#newsletter")).click();
        driver.findElement(By.cssSelector("#optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Rudik");
        driver.findElement(By.id("first_name")).sendKeys("Rudik");
        driver.findElement(By.id("last_name")).sendKeys("Harutyunyan");
        driver.findElement(By.id("last_name")).sendKeys("Harutyunyan");
        driver.findElement(By.id("company")).sendKeys("BangladeshWine");
        driver.findElement(By.id("company")).sendKeys("BangladeshWine");
        driver.findElement(By.id("address1")).sendKeys("Yerevan,Artsakh ave 20/1");
        driver.findElement(By.id("address2")).sendKeys("Yerevan,Artsakh ave 20/1");
        driver.findElement(By.id("state")).sendKeys("Colorado");
        driver.findElement(By.id("city")).sendKeys("Lakewood");
        driver.findElement(By.id("zipcode")).sendKeys("1155");
        driver.findElement(By.id("mobile_number")).sendKeys("+37455515141");
        driver.findElement(By.cssSelector("#form > div > div > div > div > form > button")).click();
        if (driver.findElement(By.cssSelector("#form > div > div > div > h2 > b")).isDisplayed()){
            System.out.println("Visible");
        }else System.out.println("not visible");
        driver.findElement(By.cssSelector("#form > div > div > div > div > a")).click();
        String str = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(9) > a")).getText();
        if (str.equals(" Logged in as")){
            System.out.println("chishta sax");
        }else System.out.println("sxala");
        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")).click();
        if (driver.findElement(By.cssSelector("#deleteModal > div > div > div.modal-body > h4")).isDisplayed()){
            driver.findElement(By.cssSelector("#deleteModal > div > div > div.modal-footer > form > button")).click();
        }


    }
}
