package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class task2 {



    static int elementSize(By element) {
        WebDriver driver = new ChromeDriver();
        List<WebElement> elements = driver.findElements(element);
        return elements.size();
    }

    @Test
    public void amazonSearchDropDownTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Select select = new Select((driver.findElement(By.id("searchDropdownBox"))));
        //select.selectByValue("search-alias=baby-products-intl-ship");
        //select.selectByIndex(3);
        select.selectByVisibleText("Computers");
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("dell laptop");
        searchField.submit();
        elementSize(By.xpath("//*[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']"));
        driver.quit();
        // List<WebElement> elements = driver.findElements(By.xpath("//*[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']"));
        //System.out.println(elements.size());

    }
}

