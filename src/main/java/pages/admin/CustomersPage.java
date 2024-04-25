package pages.admin;

import compolents.AdminLeftNavigationBar;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.util.NoSuchElementException;

public class CustomersPage extends BasePage {

    private static final By  CUSTOMERS_HEADING = By.cssSelector("div.container-fluid>h1");
    private static final By EMAIL_INPUT_FIELD = By.id("input-email");
    private static final By FILTER_BUTTON = By.id("button-filter");

    private static final By FIRST_EDIT_CUSTOMER_BUTTON = By.xpath("//tr[1]//i[@class='fa fa-pencil']");

    /**
     * Filters the list of customers by a given email address
     * @param emailAddress : the email address needed for the filtering
     */
    public static void filterByEmail(String emailAddress) {
        writeTextInWebElement(EMAIL_INPUT_FIELD, emailAddress);
        clickOnWebElementByLocator(FILTER_BUTTON);
    }

    public static void openEditCustomerPage() {
        try {
            clickOnWebElementByLocator(FIRST_EDIT_CUSTOMER_BUTTON);
        } catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }




}
