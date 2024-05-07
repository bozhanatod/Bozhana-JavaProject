package tests.admin;

import compolents.AdminLeftNavigationBar;
import org.testng.annotations.Test;
import pages.admin.CustomersPage;
import pages.admin.EditCustomerPage;
import pages.admin.LoginPage;
import tests.base.BaseTest;

public class EditCustomerPageTest extends BaseTest {


    /**
     * Filters the customers by email and opens the Edit customer page of the first customer in the list
     */
    @Test
    public void openEditCustomerPageTest() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin10", "parola123!");
        AdminLeftNavigationBar.openCustomersPage();
        CustomersPage.filterByEmail("NlaOqZI@SkxGI.com");
        CustomersPage.openEditCustomerPage();
        EditCustomerPage.verifySubheadingText();
    }


}
