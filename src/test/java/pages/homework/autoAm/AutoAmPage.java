package pages.homework.autoAm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AutoAmPage {

    WebDriver driver;

    @FindBy (id = "ppialog-popover-cancel-button")
    WebElement popupCancel;

    @FindBy (css = "#filter-make")
    WebElement selectMark;

    @FindBy (id = "search-btn")
    WebElement searchButton;

    @FindBy (id = "v-model")
    WebElement selectModel;

    @FindBy (name = "year[gt]")
    WebElement selectMinYear;

    @FindBy (css = "#home-filters > div.col.s12.m12.l12.home-filters-switch > div:nth-child(1) > label > span")
    WebElement checkBoxMaqsazercvac;

    @FindBy (css = "[class = card-desc]")
    List<WebElement> searchResult;

    public AutoAmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkResultOfSearch(){
        Assert.assertEquals(searchResult.size(),3,"No match!!");
    }

    public void checkAutoAmPageTitle(String title){
        Assert.assertEquals(driver.getTitle(), title,"Title not match!!!");
    }

    public void selectMark(){
        Select dropDownMark = new Select(selectMark);
        dropDownMark.selectByVisibleText("Tesla");
    }

    public void selectModel(){
        Select select = new Select(selectModel);
        select.selectByVisibleText("Model Y");
    }

    public void selectMinYear(){
        Select select = new Select(selectMinYear);
        select.selectByVisibleText("2018");
    }

    public void clickMaqsazercvac(){
        checkBoxMaqsazercvac.click();
    }

    public void SearchButtonClick(){
        searchButton.click();
    }

    public void popupCancel(){
        popupCancel.click();
    }



}
