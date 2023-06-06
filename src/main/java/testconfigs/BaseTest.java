package testconfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

  public static WebDriver webDriver;
  public static WebDriverWait webDriverWait;

  @BeforeTest
  public static void setupDriver() {
    webDriver = new ChromeDriver();
    webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(4));
  }

  @AfterTest
  public static void tearDownDriver() {
    webDriver.quit();
  }
}
