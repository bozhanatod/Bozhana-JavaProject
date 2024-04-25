package tests.admin;

import compolents.AdminLeftNavigationBar;
import org.testng.annotations.Test;
import pages.admin.LoginPage;
import pages.admin.OrderPage;
import tests.base.BaseTest;

public class OrderPageTest extends BaseTest {

    /**
     * Opens Add Order form
     */
    @Test
    public static void openAddOrderFormTest() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        AdminLeftNavigationBar.openOrdersPage();
        OrderPage.openAddOrderPage();
        OrderPage.verifyAddOrderHeader();
    }

    /**
     * On Add order page in Customer Details form leave the obligatory input fields empty and press the Continue button
     */
    @Test
    public static void addOrderCustomerDetailsFormEmptyObligatoryFieldsTest() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        AdminLeftNavigationBar.openOrdersPage();
        OrderPage.openAddOrderPage();
        OrderPage.placeNewOrderFillInCustomerDetailsForm("", "", "", "");
        OrderPage.verifyWarningMessagesInCustomerDetailsForm();
    }

    /**
     * Places order for product HTC Touch HD by using country Bulgaria and region Sofia
     * The message for successfully placed order is verified at the last step of the order
     */
    @Test
    public static void placeNewOrderTest() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        AdminLeftNavigationBar.openOrdersPage();
        OrderPage.openAddOrderPage();
        OrderPage.placeNewOrderFillInCustomerDetailsForm("Michael", "Jackson", "mj@adfa.com", "789789789");
        OrderPage.placeNewOrderFillInProductsFormProductHTCTouchHD("1");
        OrderPage.placeNewOrderFillInPaymentDetailsForm("Michael", "Jackson", "ul. Central Road 18", "Sofia");
        OrderPage.placeNewOrderFillInShippingDetailsForm("Michael", "Jackson", "ul. Central Road 18", "Sofia");
        OrderPage.placeNewOrderFillInTotalsForm();
        OrderPage.verifySuccessfulOrderMessage();
    }
}
