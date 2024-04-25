package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import utils.WaitTool;

public class LoginPage extends BasePage {
    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final String LOGIN_PAGE_URL = "https://shop.pragmatic.bg/admin";

    private static final By FORGOTTEN_PASSWORD_LINK =By.cssSelector("span.help-block a");

    private static final String CURRENT_PAGE_TITLE = "Administration";

    /**
     * Opens the login page of admin website
     */
    public static void goToLoginPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    /**
     * This method performs login.
     * @param username : The username which should be entered in the 'username' input field.
     * @param password : The password which should be entered in the 'password' input field.
     */
    public static void login(String username, String password) {
        writeInUsernameInputField(username);
        writeInPasswordInputField(password);
        clickLoginButton();
    }

    /**
     * Fills in the 'username' input field
     * @param username : The username which should be entered in the 'username' input field.
     */
    private static void writeInUsernameInputField(String username) {
        writeTextInWebElement(USERNAME_INPUT_FIELD, username);
    }

    /**
     * Fills in the 'password' input field
     * @param password : The password which should be entered in the 'password' input field.
     */
    private static void writeInPasswordInputField(String password) {
        writeTextInWebElement(PASSWORD_INPUT_FIELD, password);
    }

    /**
     * Clicks on the Login button
     */
    private static void clickLoginButton() {
        clickOnWebElementByLocator(LOGIN_BUTTON);
    }

    /**
     * Clicks on the 'Forgotten Password' link
     */
    public static void clickForgottenPasswordLink() {
        clickOnWebElementByLocator(FORGOTTEN_PASSWORD_LINK);
    }

    /**
     * Gets the title of the current page
     */
    public static String getPageTitle() {
        return getCurrentPageTitle();
    }

    public static void verifyCurrentPageTitle() {
        String actualPageTitle = getPageTitle();
        Assert.assertEquals(actualPageTitle, CURRENT_PAGE_TITLE);
    }
}
