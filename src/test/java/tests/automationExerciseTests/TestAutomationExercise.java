package tests.automationExerciseTests;

import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.homework.automationExercise.AutomationExercisePage;
import pages.homework.automationExercise.EnterAccountInfoPage;

public class TestAutomationExercise extends SeleniumBase {

    AutomationExercisePage exercisePage;
    EnterAccountInfoPage infoPage;

    @Test(priority = 1)
    public void automationExercisePageCheck() {
        exercisePage = new AutomationExercisePage(driver);
        driver.get(getBaseUrl2());
        exercisePage.isHomePageVisible();
        exercisePage.clickSignUpButton();
        exercisePage.isNewUserSignupVisible();
        exercisePage.fillName("Gago");
        exercisePage.fillEmail("Gago@mail.ru");
        exercisePage.clickSignOnFinal();
    }

    @Test(priority = 2)
    public void enterAccountInfoCheck() {
        infoPage = new EnterAccountInfoPage(driver);
        infoPage.isEnterAccountInfoVisible();
        infoPage.setGender();
        infoPage.fillPassword("55555555");
        infoPage.fillAddressInfo("Gago", "Makoyan", "GagoLLC",
                "Kursk", "Kursk", "Russia", "Ohio",
                "Cincinatti", "515141");
        infoPage.selectCountry();
        infoPage.clickCreateAccountButton();
        infoPage.clickContinueButton();

    }
}
