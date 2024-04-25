package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;
import utils.WaitTool;

public class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    /**
     * This method clicks on the WebElement
     * @param locator : The locator of the element which should be clicked on.
     */
    public static void clickOnWebElementByLocator(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * This method writes text in a WebElement
     * @param locator : The locator of the WebElement into which should be written text.
     * @param text : The text that should be written in the WebElement.
     */
    public static void writeTextInWebElement(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    /**
     * Gets the title of the current page
     */
    public static String getCurrentPageTitle() {
        return driver.getTitle();
    }

    /**
     * Gets the text of the web element
     * @param locator : the locator of the web element
     * @return
     */
    public static String getWebElementText (By locator) {
        return driver.findElement(locator).getText();
    }

    /**
     * Clears the input field of the web element
     * @param locator : the locator of the web element
     */
    public static void clearWebElementInputField(By locator) {
        driver.findElement(locator).clear();
    }

    /**
     * Finds the first web element with the given locator
     * @param locator : the locator of the searched web element
     * @return : returns the searched web element
     */
    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }




}
