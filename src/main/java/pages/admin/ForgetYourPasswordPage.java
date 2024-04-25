package pages.admin;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.base.BasePage;

public class ForgetYourPasswordPage extends BasePage {

    private static final By CANCEL_BUTTON = By.cssSelector("a.btn.btn-default");

    private static final By RESET_BUTTON = By.cssSelector("button.btn.btn-primary");

    private static final By WARNING_MISSING_EMAIL = By.cssSelector("div.alert-danger");

    private static final String WARNING_MISSING_EMAIL_TEXT = "Warning: The E-Mail Address was not found in our records, please try again!";


    /**
     * Clicks on Cancel button on the page
     */
    public static void clickCancelButton() {
        clickOnWebElementByLocator(CANCEL_BUTTON);
    }

    /**
     * Clicks on Reset button on the page
     */
    public static void clickResetButton() {
        clickOnWebElementByLocator(RESET_BUTTON);
    }

    /**
     * Asserts the warning message of missing email
     */
    public static void verifyWarningMessageMissingEmail() {
        Assert.assertTrue(getWebElementText(WARNING_MISSING_EMAIL).contains(WARNING_MISSING_EMAIL_TEXT));
    }
}
