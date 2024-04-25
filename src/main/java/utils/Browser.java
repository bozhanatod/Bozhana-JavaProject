package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    /**
     * This method opens the browser and maximizes its window.
     */
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Closes the browser and all its windows.
     */
    public static void tearDown() {
        driver.quit();
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
