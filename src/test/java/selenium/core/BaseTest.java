package selenium.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseTest {
    static protected WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        BasePage.driver = driver;
    }

    @AfterAll
    static void quit() {
        driver.quit();
    }
}
