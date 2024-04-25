package tests.admin;

import compolents.AdminHeather;
import org.testng.annotations.Test;
import pages.admin.LoginPage;
import tests.base.BaseTest;

public class LogoutTest extends BaseTest {


    /**
     * Tests the logout function
     */
    @Test
    public static void logoutTest() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        AdminHeather.logout();
        LoginPage.verifyCurrentPageTitle();
    }
}