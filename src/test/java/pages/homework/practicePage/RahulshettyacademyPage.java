package pages.homework.practicePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RahulshettyacademyPage {

    WebDriver driver;

    @FindBy(css = "[value='radio2']")
    WebElement radioButton;

    @FindBy(id = "autocomplete")
    WebElement suggession;

    @FindBy(id = "dropdown-class-example")
    WebElement dropDown;

    @FindBy(id = "checkBoxOption1")
    WebElement checkBoxOption1;

    @FindBy(id = "openwindow")
    WebElement openWindowButton;

    @FindBy(id = "opentab")
    WebElement openTab;

    @FindBy(id = "alertbtn")
    WebElement alertButton;

    @FindBy(id = "name")
    WebElement enterYourNameField;

    @FindBy(id = "confirmbtn")
    WebElement confirmButton;

    @FindBy(id = "hide-textbox")
    WebElement hideTextButton;

    @FindBy(id = "show-textbox")
    WebElement showTextButton;

    @FindBy(id = "displayed-text")
    WebElement displayedText;

    @FindBy(xpath = "//*[@id=\"product\"]/tbody/tr[10]/td[2]")
    WebElement row;

    @FindBy(id = "mousehover")
    WebElement target;

    @FindBy(linkText = "Top")
    WebElement topLink;

    @FindBy(linkText = "Reload")
    WebElement reloadLink;

    public void mouseHoverAction(){
        Actions action = new Actions(driver);
        action.moveToElement(target).perform();
        action.moveToElement(reloadLink).perform();
        reloadLink.click();
    }




    public void checkWebTable(){
        Assert.assertTrue(row.getText().contains("Advanced"),"not match!!");
    }

    public void isElementDisplayed(){
        showTextButton.click();
        Assert.assertTrue(displayedText.isDisplayed(),"text field is not displayed");
    }

    public void isElementNotDisplayed(){
        hideTextButton.click();
        Assert.assertFalse(displayedText.isDisplayed(),"text field is displayed");
    }

    public void alertConfirm(String enterName) {
        enterYourNameField.sendKeys(enterName);
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void alertAccept() {
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void openNewTab() {
        openTab.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void openNewWindow() {
        openWindowButton.click();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();

            if (!parent.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    }

    public void selectCheckBox() {
        if (checkBoxOption1.isSelected()) {
            System.out.println("selected");
        } else checkBoxOption1.click();
    }

    public void setCheckBoxOption1() {
        checkBoxOption1.click();
    }

    public void setDropDown(String value) {
        // values = option1, option2, option3
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }

    public void setRadioButton() {
        radioButton.click();
    }

    public void fillSuggession(String str) {
        suggession.sendKeys(str);
    }

    public RahulshettyacademyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
