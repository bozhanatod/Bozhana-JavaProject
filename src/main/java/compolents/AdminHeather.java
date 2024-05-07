package compolents;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.base.BasePage;

public class AdminHeather extends BasePage {

    private static final By logoutButton = By.cssSelector("span.hidden-xs.hidden-sm");

    private static final String logoutButtonName = "Logout";

    /**
     * The user logs out
     */
    public static void logout() {
        clickOnWebElementByLocator(logoutButton);
    }

    /**
     * Asserts the name of the logout button
     */
    public static void verifyLogoutButtonName() {
        String actualLogoutButtonName = getWebElementText(logoutButton);
        Assert.assertEquals(actualLogoutButtonName, logoutButtonName);
    }


}
