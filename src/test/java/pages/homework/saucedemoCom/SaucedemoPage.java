package pages.homework.saucedemoCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SaucedemoPage {
    WebDriver driver;

    public SaucedemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement userName;


    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = "[class=product_sort_container]")
    WebElement filter;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCardButton;

    @FindBy(css = "[class=shopping_cart_link]")
    WebElement cart;

    @FindBy(css = "[class=\"cart_item_label\"]")
    WebElement cartItem;

    @FindBy(id = "checkout")
    WebElement checkout;

    @FindBy(id = "first-name")
    WebElement fName;

    @FindBy(id = "last-name")
    WebElement lName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(css = "[class=\"summary_total_label\"]")
    WebElement total;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(css = "[class=\"complete-header\"]")
    WebElement completeHeader;

    public void checkFinalHeaderText() {
        Assert.assertTrue(completeHeader.getText().contains("THANK YOU FOR YOUR ORDER"));
    }

    public void finishButtonClick() {
        finishButton.click();
    }

    public void checkPrice() {
        Assert.assertTrue(total.getText().contains("53.99"));
    }

    public void continueButtonClick() {
        continueButton.click();
    }

    public void fillCheckoutInfo(String firstName, String lastName, String zip) {
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
        postalCode.sendKeys(zip);
    }

    public void checkoutClick() {
        checkout.click();
    }

    public void checkItemInCard() {
        Assert.assertTrue(cartItem.getText().contains("Sauce Labs Fleece Jacket"), "There is no item");
    }

    public void cartClick() {
        cart.click();
    }

    public void addToCardButtonClick() {
        addToCardButton.click();
    }

    public void checkFilter() {
        List<WebElement> elements = new ArrayList<>(driver.findElements(By.cssSelector("[class=inventory_item_price]")));
        String text1 = elements.get(0).getText();
        String[] price1 = text1.split("\\$");
        String text2 = elements.get(1).getText();
        String[] price2 = text2.split("\\$");
        String f = price1[1];
        String s = price2[1];
        double first = Double.parseDouble(f);
        double second = Double.parseDouble(s);
        Assert.assertTrue(first < second, "filter is working wrong");

    }

    public void setFilter() {
        Select select = new Select(filter);
        select.selectByValue("lohi");
    }

    public void checkLocation() {
        // System.out.println(driver.findElement(By.cssSelector("[class=header_secondary_container]")).getText());
        Assert.assertTrue(driver.findElement(By.cssSelector("[class=header_secondary_container]"))
                .getText().contains("PRODUCTS"), "it is NOT products page");
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public void fillUserName() {
        String text = driver.findElement(By.cssSelector("div#login_credentials")).getText();
        String lines[] = text.split("\\r?\\n");
        userName.sendKeys(lines[1]);
    }

    public void fillPassword() {
        String text = driver.findElement(By.cssSelector("[class=login_password]")).getText();
        String lines[] = text.split("\\r?\\n");
        password.sendKeys(lines[1]);
    }


}
