package pages.homework.automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EnterAccountInfoPage {

    WebDriver driver;

    @FindBy(css = "[class='title text-center']")
    WebElement enterAccountInfo;

    @FindBy(id = "id_gender1")
    WebElement radioMr;;

    @FindBy(id = "name")
    WebElement fName;

    @FindBy(id = "email")
    WebElement fEmail;

    @FindBy(id = "password")
    WebElement fPassword;

    @FindBy(id = "days")
    WebElement day;

    @FindBy(id = "months")
    WebElement moth;

    @FindBy(id = "years")
    WebElement year;

    @FindBy(id = "newsletter")
    WebElement newsletterBox;

    @FindBy(id = "optin")
    WebElement receiveBox;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "country")
    WebElement country1;

    @FindBy(id = "state")
    WebElement state1;

    @FindBy(id = "city")
    WebElement city1;

    @FindBy(id = "zipcode")
    WebElement zipcode1;

    @FindBy(id = "mobile_number")
    WebElement mobileNumber1;

    @FindBy(css = "[data-qa=create-account]")
    WebElement createAccountButton;

    @FindBy(linkText = "Continue")
    WebElement continueButton;

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }
    public void fillAddressInfo(String fName, String lName, String companyName
            , String adr1, String adr2, String state, String city
            , String zipcode,String mobileNumber) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(companyName);
        address1.sendKeys(adr1);
        address2.sendKeys(adr2);
        state1.sendKeys(state);
        city1.sendKeys(city);
        zipcode1.sendKeys(zipcode);
        mobileNumber1.sendKeys(mobileNumber);
    }
    public void selectCountry(){
        Select select = new Select(country1);
        select.selectByVisibleText("Canada");
    }

    public void clickReceiveBox() {
        receiveBox.click();
    }

    public void clickNewsletterBox() {
        newsletterBox.click();
    }

    public void setYear(String value) {
        Select select = new Select(year);
        select.selectByValue(value);
    }

    public void setMoth(String value) {
        Select select = new Select(moth);
        select.selectByValue(value);
    }

    public void setDay(String value) {
        Select select = new Select(day);
        select.selectByValue(value);
    }

    public void fillPassword(String password) {
        fPassword.clear();
        fPassword.sendKeys(password);
    }


    public void setGender() {
        radioMr.click();
    }

    public void isEnterAccountInfoVisible() {
        Assert.assertTrue(enterAccountInfo.getText().contains("ENTER ACCOUNT"), "ENTER ACCOUNT INFO is not visible");
    }


    public EnterAccountInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
