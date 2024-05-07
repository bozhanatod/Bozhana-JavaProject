package pages.admin;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.base.BasePage;
import utils.WaitTool;

public class EditCustomerPage extends BasePage {

    private static final By EDIT_CUSTOMER_SUBHEADING = By.cssSelector("h3.panel-title");

    private static final String CURRENT_PAGE_SUBHEADING_TEXT = "Edit Customer";


    /**
     * Asserts the subheading in Edit Customer page
     */
    public static void verifySubheadingText() {
        WaitTool.waitForElementVisibility(EDIT_CUSTOMER_SUBHEADING, 10);
        String actualSubheadingText = getWebElementText(EDIT_CUSTOMER_SUBHEADING);
        Assert.assertEquals(actualSubheadingText, CURRENT_PAGE_SUBHEADING_TEXT);
    }
}
