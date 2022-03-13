package tests.autoAmTests;

import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.homework.autoAm.AutoAmPage;
import pages.homework.autoAm.GooglePage;

public class TestAutoAm extends SeleniumBase {

    GooglePage googlePage;
    AutoAmPage autoAmPage;

    @Test(priority = 1)
    public void checkGoogleSearch() {
        googlePage = new GooglePage(driver);
        driver.get(getBaseUrl1());
        googlePage.setGoogleInput();
        googlePage.clickSearchButton();
        googlePage.clickFirstResult();
    }

    @Test(priority = 2)
    public void checkAutoAm() {
        autoAmPage = new AutoAmPage(driver);
        autoAmPage.checkAutoAmPageTitle("Ավտոմեքենաների վաճառք Հայաստանում - Auto.am");
        autoAmPage.popupCancel();
        autoAmPage.selectMark();
        autoAmPage.selectMinYear();
        autoAmPage.selectModel();
        autoAmPage.clickMaqsazercvac();
        autoAmPage.SearchButtonClick();
        autoAmPage.checkResultOfSearch();

    }

}
