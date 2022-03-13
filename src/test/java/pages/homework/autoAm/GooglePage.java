package pages.homework.autoAm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    WebDriver driver;

    @FindBy (name = "q")
    WebElement googleInput;

    @FindBy (name = "btnK")
    WebElement searchButtonGoogle;

    @FindBy (css = "#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3")
    WebElement firstResult;

    public GooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setGoogleInput(){
        googleInput.sendKeys("auto am");
    }

    public void clickSearchButton(){
        searchButtonGoogle.click();
    }

    public void clickFirstResult(){
        firstResult.click();
    }



}
