package pages.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PaymentGatewayPage {

    WebDriver driver;

    public PaymentGatewayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickDismissAdd() {
        try {
            addDismiss.click();
        } catch (Exception e) {
        }
    }

    @FindBy(linkText = "Generate Card Number")
    WebElement generateCardNumber;

    @FindBy(linkText = "Cart")
    WebElement cart;

    // Select quantity = new Select(driver.findElement(By.name("quantity")));

    @FindBy(className = "button.special")
    WebElement buyNowButton;

    @FindBy(linkText = "Payment Gateway Project")
    WebElement paymentGatewayProject;

    @FindBy(id = "dismiss-button")
    WebElement addDismiss;

    @FindBy(css = "h4:nth-child(3)")
    WebElement cardNumber;

    @FindBy(css = "h4:nth-child(4)")
    WebElement cvv;

    @FindBy(css = "h4:nth-child(5)")
    WebElement expDate;


    public void clickGenerateCardNumber() {
        generateCardNumber.click();
    }

    public void clickPaymentGatewayProject() {
        paymentGatewayProject.click();
    }

    //  public void select(String count) {
    //      quantity.selectByVisibleText(count);
    // }

    public void inputCardNumber(WebElement cardNumber) {

    }


}

