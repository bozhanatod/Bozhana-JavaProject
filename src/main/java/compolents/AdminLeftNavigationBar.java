package compolents;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class AdminLeftNavigationBar extends BasePage {

    private static final By CUSTOMERS_MENU = By.cssSelector("li#menu-customer a");

    private static final By CUSTOMERS_OPTION = By.cssSelector("li#menu-customer li a");

    private static final By SALES_MENU = By.cssSelector("i.fa.fa-shopping-cart.fw");

    private static final By ORDERS_OPTION = By.xpath("(//li[@id='menu-sale']/ul//a)[1]");

    /**
     * Opens Customers page by clicking on Customers menu and then on Customers option
     */
    public static void openCustomersPage() {
        clickOnWebElementByLocator(CUSTOMERS_MENU);
        clickOnWebElementByLocator(CUSTOMERS_OPTION);
    }

    /**
     * Opens Orders page by clicking on Sales menu and then on Orders option
     */
    public static void openOrdersPage() {
        clickOnWebElementByLocator(SALES_MENU);
        clickOnWebElementByLocator(ORDERS_OPTION);
    }


}
