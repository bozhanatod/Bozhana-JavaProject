package tests.admin;

import org.testng.annotations.Test;
import pages.admin.ForgetYourPasswordPage;
import pages.admin.LoginPage;
import pages.base.BasePage;
import tests.base.BaseTest;

public class ForgetYourPasswordPageTest extends BaseTest {


    /**
     * Tests Cancel button in Forget Your Password page
     */
    @Test
    public void clickCancelButtonTest() {
        LoginPage.goToLoginPage();
        LoginPage.clickForgottenPasswordLink();
        ForgetYourPasswordPage.clickCancelButton();
        LoginPage.verifyCurrentPageTitle();
    }

    /**
     * Tests the warning message that appears if Reset button is clicked while the email input field is empty
     */
    @Test
    public void clickRestButtonNegativeTest() {
        LoginPage.goToLoginPage();
        LoginPage.clickForgottenPasswordLink();
        ForgetYourPasswordPage.clickResetButton();
        ForgetYourPasswordPage.verifyWarningMessageMissingEmail();
    }
}
