package pages.homework.automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AutomationExercisePage {

    WebDriver driver;

    @FindBy(css = "[class = header-middle]")
    WebElement header;

    @FindBy(partialLinkText = "Signup")
    WebElement signUpButton;

    @FindBy(css = "[class = signup-form]")
    WebElement newUserSignup;

    @FindBy(css = "[name=name]")
    WebElement nameSignUp;

    @FindBy(css = "[data-qa=signup-email]")
    WebElement emailSignUp;

    @FindBy(css = "[data-qa=signup-button]")
    WebElement signUpButtonFinal;


    public void clickSignOnFinal(){
        signUpButtonFinal.click();
    }

    public void fillEmail(String email) {
        emailSignUp.clear();
        emailSignUp.sendKeys(email);
    }

    public void fillName(String name) {
        nameSignUp.clear();
        nameSignUp.sendKeys(name);
    }


    public void isNewUserSignupVisible() {
        Assert.assertTrue(newUserSignup.getText().contains("New User Signup!"), "New User Signup is not visible");
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void isHomePageVisible() {
        Assert.assertTrue(header.isDisplayed(), "Home page is not visible");
    }

    public AutomationExercisePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
