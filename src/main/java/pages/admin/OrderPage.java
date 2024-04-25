package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.base.BasePage;
import utils.WaitTool;

public class OrderPage extends BasePage {

    private static final By ADD_NEW_ORDER_BUTTON = By.cssSelector("i.fa.fa-plus");
    private static final By FIRST_NAME_INPUT_FIELD_CUSTOMER_DETAILS = By.id("input-firstname");
    private static final By LAST_NAME_INPUT_FIELD_CUSTOMER_DETAILS = By.id("input-lastname");
    private static final By EMAIL_INPUT_FIELD_CUSTOMER_DETAILS = By.id("input-email");
    private static final By TELEPHONE_INPUT_FIELD_CUSTOMER_DETAILS = By.id("input-telephone");
    private static final By CONTINUE_BUTTON_CUSTOMER_DETAILS_FORM = By.id("button-customer");
    private static final By FIRST_NAME_WARNING_MESSAGE = By.cssSelector("#input-firstname~div");
    private static final By LAST_NAME_WARNING_MESSAGE = By.cssSelector("#input-lastname~div");
    private static final By EMAIL_WARNING_MESSAGE = By.cssSelector("#input-email~div");
    private static final By TELEPHONE_WARNING_MESSAGE = By.cssSelector("#input-telephone~div");
    private static final By ADD_ORDER_HEADER = By.cssSelector("h3.panel-title");
    private static final By CHOOSE_PRODUCT_INPUT_FIELD = By.id("input-product");
    private static final By CHOOSE_PRODUCT_INPUT_FIELD_HTCTouchHD_OPTION = By.cssSelector("#input-product~ul li[data-value='28']");
    private static final By QUANTITY_INPUT_FIELD = By.id("input-quantity");
    private static final By ADD_PRODUCT_BUTTON = By.id("button-product-add");
    private static final By CONTINUE_BUTTON_PRODUCTS_FORM = By.id("button-cart");
    private static final By PRODUCT_ROW_IN_PRODUCT_TABLE = By.cssSelector("tbody#cart tr");
    private static final By FIRST_NAME_INPUT_FIELD_PAYMENT_DETAILS = By.id("input-payment-firstname");
    private static final By LAST_NAME_INPUT_FIELD_PAYMENT_DETAILS = By.id("input-payment-lastname");
    private static final By ADDRESS_INPUT_FIELD_PAYMENT_DETAILS = By.id("input-payment-address-1");
    private static final By CITY_NAME_INPUT_FIELD_PAYMENT_DETAILS = By.id("input-payment-city");
    private static final By COUNTRY_DROPDOWN_PAYMENT_DETAILS = By.id("input-payment-country");
    private static final By COUNTRY_DROPDOWN_BULGARIA_OPTION_PAYMENT_DETAILS = By.cssSelector("select#input-payment-country>option[value='33']");
    private static final By REGION_DROPDOWN_PAYMENT_DETAILS = By.id("input-payment-zone");
    private static final By REGION_DROPDOWN_SOFIA_OPTION_PAYMENT_DETAILS = By.cssSelector("select#input-payment-zone>option[value='497']");
    private static final By CONTINUE_BUTTON_PAYMENT_DETAILS = By.id("button-payment-address");
    private static final By FIRST_NAME_INPUT_FIELD_SHIPPING_DETAILS = By.id("input-shipping-firstname");
    private static final By LAST_NAME_INPUT_FIELD_SHIPPING_DETAILS = By.id("input-shipping-lastname");
    private static final By ADDRESS_INPUT_FIELD_SHIPPING_DETAILS = By.id("input-shipping-address-1");
    private static final By CITY_NAME_INPUT_FIELD_SHIPPING_DETAILS = By.id("input-shipping-city");
    private static final By COUNTRY_DROPDOWN_SHIPPING_DETAILS = By.id("input-shipping-country");
    private static final By COUNTRY_DROPDOWN_BULGARIA_OPTION_SHIPPING_DETAILS = By.cssSelector("select#input-shipping-country>option[value='33']");
    private static final By REGION_DROPDOWN_SHIPPING_DETAILS = By.id("input-shipping-zone");
    private static final By REGION_DROPDOWN_SOFIA_OPTION_SHIPPING_DETAILS = By.cssSelector("select#input-shipping-zone>option[value='497']");
    private static final By CONTINUE_BUTTON_SHIPPING_DETAILS = By.id("button-shipping-address");
    private static final By SHIPPING_METHOD_DROPDOWN_TOTALS = By.id("input-shipping-method");
    private static final By SHIPPING_METHOD_DROPDOWN_FLAT_RATE_OPTION_TOTALS = By.cssSelector("select#input-shipping-method option[value='flat.flat']");
    private static final By PAYMENT_METHOD_DROPDOWN_TOTALS = By.id("input-payment-method");
    private static final By PAYMENT_METHOD_DROPDOWN_CASH_ON_DELIVERY_OPTION_TOTALS = By.cssSelector("#input-payment-method>[value='cod']");
    private static final By SAVE_BUTTON_TOTALS = By.id("button-save");
    private static final By PLACE_ORDER_SUCCESS_MESSAGE = By.cssSelector(".alert.alert-success.alert-dismissible");


    private static final String FIRST_NAME_WARNING_MESSAGE_TEXT = "First Name must be between 1 and 32 characters!";
    private static final String LAST_NAME_WARNING_MESSAGE_TEXT = "Last Name must be between 1 and 32 characters!";
    private static final String EMAIL_WARNING_MESSAGE_TEXT = "E-Mail Address does not appear to be valid!";
    private static final String TELEPHONE_WARNING_MESSAGE_TEXT = "Telephone must be between 3 and 32 characters!";
    private static final String ADD_ORDER_HEADER_TEXT = "Add Order";
    private static final String PLACE_ORDER_SUCCESS_MESSAGE_TEXT = "Success: You have modified orders!";





    /**
     * Clicks on Add new order button on Orders page
     */
    public static void openAddOrderPage() {
        clickOnWebElementByLocator(ADD_NEW_ORDER_BUTTON);
    }

    /**
     * Fills in all obligatory input fields in Customer Details form
     * @param firstName : the first name of the customer
     * @param lastName : the last name of the customer
     * @param emailAddress : the email address of the customer
     * @param telephone : the telephone of the customer
     */
    public static void placeNewOrderFillInCustomerDetailsForm(String firstName, String lastName, String emailAddress, String telephone) {
        writeTextInWebElement(FIRST_NAME_INPUT_FIELD_CUSTOMER_DETAILS, firstName);
        writeTextInWebElement(LAST_NAME_INPUT_FIELD_CUSTOMER_DETAILS, lastName);
        writeTextInWebElement(EMAIL_INPUT_FIELD_CUSTOMER_DETAILS, emailAddress);
        writeTextInWebElement(TELEPHONE_INPUT_FIELD_CUSTOMER_DETAILS, telephone);
        clickOnWebElementByLocator(CONTINUE_BUTTON_CUSTOMER_DETAILS_FORM);
    }

    /**
     * Fills in all obligatory input fields in Products form for product HTC Touch HD
     * @param quantity : This is the ordered quantity of the product
     */
    public static void placeNewOrderFillInProductsFormProductHTCTouchHD(String quantity) {
        WaitTool.waitForElementVisibility(CHOOSE_PRODUCT_INPUT_FIELD, 10);
        clickOnWebElementByLocator(CHOOSE_PRODUCT_INPUT_FIELD);
        WaitTool.waitForElementVisibility(CHOOSE_PRODUCT_INPUT_FIELD_HTCTouchHD_OPTION, 10);
        clickOnWebElementByLocator(CHOOSE_PRODUCT_INPUT_FIELD_HTCTouchHD_OPTION);
        clearWebElementInputField(QUANTITY_INPUT_FIELD);
        writeTextInWebElement(QUANTITY_INPUT_FIELD, quantity);
        clickOnWebElementByLocator(ADD_PRODUCT_BUTTON);
        WaitTool.waitForElementVisibility(PRODUCT_ROW_IN_PRODUCT_TABLE, 10);
        clickOnWebElementByLocator(CONTINUE_BUTTON_PRODUCTS_FORM);

    }


    /**
     * Fills in all obligatory input fields in Payment Details form for country Bulgaria and city Sofia
     * @param firstName : The first name of the buyer
     * @param lastName : The last name of the buyer
     * @param address : The address of the buyer
     * @param city : The city of the buyer
     */
    public static void placeNewOrderFillInPaymentDetailsForm
            (String firstName, String lastName, String address, String city) {
        WaitTool.waitForElementVisibility(FIRST_NAME_INPUT_FIELD_PAYMENT_DETAILS, 10);
        writeTextInWebElement(FIRST_NAME_INPUT_FIELD_PAYMENT_DETAILS, firstName);
        writeTextInWebElement(LAST_NAME_INPUT_FIELD_PAYMENT_DETAILS, lastName);
        writeTextInWebElement(ADDRESS_INPUT_FIELD_PAYMENT_DETAILS, address);
        writeTextInWebElement(CITY_NAME_INPUT_FIELD_PAYMENT_DETAILS, city);
        clickOnWebElementByLocator(COUNTRY_DROPDOWN_PAYMENT_DETAILS);
        Select country = new Select(getWebElement(COUNTRY_DROPDOWN_PAYMENT_DETAILS));
        WaitTool.waitForElementVisibility(COUNTRY_DROPDOWN_BULGARIA_OPTION_PAYMENT_DETAILS, 10);
        country.selectByValue("33");
        clickOnWebElementByLocator(REGION_DROPDOWN_PAYMENT_DETAILS);
        Select region = new Select(getWebElement(REGION_DROPDOWN_PAYMENT_DETAILS));
        WaitTool.waitForElementVisibility(REGION_DROPDOWN_SOFIA_OPTION_PAYMENT_DETAILS, 10);
        region.selectByValue("497");
        clickOnWebElementByLocator(CONTINUE_BUTTON_PAYMENT_DETAILS);
    }


    /**
     * Fills in all obligatory input fields in Shipping Details form for country Bulgaria and city Sofia
     * @param firstName : The first name of the buyer
     * @param lastName : The last name of the buyer
     * @param address : The address of the buyer
     * @param city : The city of the buyer
     */
    public static void placeNewOrderFillInShippingDetailsForm
            (String firstName, String lastName, String address, String city) {
        WaitTool.waitForElementVisibility(FIRST_NAME_INPUT_FIELD_SHIPPING_DETAILS, 10);
        writeTextInWebElement(FIRST_NAME_INPUT_FIELD_SHIPPING_DETAILS, firstName);
        writeTextInWebElement(LAST_NAME_INPUT_FIELD_SHIPPING_DETAILS, lastName);
        writeTextInWebElement(ADDRESS_INPUT_FIELD_SHIPPING_DETAILS, address);
        writeTextInWebElement(CITY_NAME_INPUT_FIELD_SHIPPING_DETAILS, city);
        clickOnWebElementByLocator(COUNTRY_DROPDOWN_SHIPPING_DETAILS);
        Select country = new Select(getWebElement(COUNTRY_DROPDOWN_SHIPPING_DETAILS));
        WaitTool.waitForElementVisibility(COUNTRY_DROPDOWN_BULGARIA_OPTION_SHIPPING_DETAILS, 10);
        country.selectByValue("33");
        clickOnWebElementByLocator(REGION_DROPDOWN_SHIPPING_DETAILS);
        Select region = new Select(getWebElement(REGION_DROPDOWN_SHIPPING_DETAILS));
        WaitTool.waitForElementVisibility(REGION_DROPDOWN_SOFIA_OPTION_SHIPPING_DETAILS, 10);
        region.selectByValue("497");
        clickOnWebElementByLocator(CONTINUE_BUTTON_SHIPPING_DETAILS);
    }

    /**
     * Fills in all obligatory input fields in Totals form with shipping method 'Flat shipping' and payment method 'Cash On Delivery'
     */
    public static void placeNewOrderFillInTotalsForm() {
        WaitTool.waitForElementVisibility(SHIPPING_METHOD_DROPDOWN_TOTALS, 10);
        clickOnWebElementByLocator(SHIPPING_METHOD_DROPDOWN_TOTALS);
        Select shippingMethod = new Select(getWebElement(SHIPPING_METHOD_DROPDOWN_TOTALS));
        WaitTool.waitForElementVisibility(SHIPPING_METHOD_DROPDOWN_FLAT_RATE_OPTION_TOTALS, 10);
        shippingMethod.selectByValue("flat.flat");
        clickOnWebElementByLocator(PAYMENT_METHOD_DROPDOWN_TOTALS);
        Select paymentMethod = new Select(getWebElement(PAYMENT_METHOD_DROPDOWN_TOTALS));
        WaitTool.waitForElementVisibility(PAYMENT_METHOD_DROPDOWN_CASH_ON_DELIVERY_OPTION_TOTALS, 10);
        paymentMethod.selectByValue("cod");
        clickOnWebElementByLocator(SAVE_BUTTON_TOTALS);
    }

    /**
     * Asserts if the message for the successfully placed order is correct
     */
    public static void verifySuccessfulOrderMessage() {
        WaitTool.waitForElementVisibility(PLACE_ORDER_SUCCESS_MESSAGE,10);
        Assert.assertTrue(getWebElementText(PLACE_ORDER_SUCCESS_MESSAGE).contains(PLACE_ORDER_SUCCESS_MESSAGE_TEXT));
    }




    /**
     * Asserts if the text of Add Order header is correct
     */
    public static void verifyAddOrderHeader() {
        Assert.assertEquals(getWebElementText(ADD_ORDER_HEADER), ADD_ORDER_HEADER_TEXT);
    }

    /**
     * Asserts if in Customer Details form the warning messages of the obligatory input fields are correct
     */
    public static void verifyWarningMessagesInCustomerDetailsForm() {
        WaitTool.waitForElementVisibility(FIRST_NAME_WARNING_MESSAGE, 10);
        Assert.assertEquals(getWebElementText(FIRST_NAME_WARNING_MESSAGE), FIRST_NAME_WARNING_MESSAGE_TEXT);
        Assert.assertEquals(getWebElementText(LAST_NAME_WARNING_MESSAGE), LAST_NAME_WARNING_MESSAGE_TEXT);
        Assert.assertEquals(getWebElementText(EMAIL_WARNING_MESSAGE), EMAIL_WARNING_MESSAGE_TEXT);
        Assert.assertEquals(getWebElementText(TELEPHONE_WARNING_MESSAGE), TELEPHONE_WARNING_MESSAGE_TEXT);
    }


}
