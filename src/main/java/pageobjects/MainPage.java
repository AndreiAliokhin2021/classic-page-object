package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {

  private final WebDriver webDriver;
  private final WebDriverWait webDriverWait;


  @FindBy(id = "filter_keyword")
  private WebElement searchInput;

  @FindBy(css = ".list-inline .prdocutname")
  private List<WebElement> results;

  public MainPage(WebDriver driver) {
    this.webDriver = driver;
    this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(4));
    PageFactory.initElements(driver, this);
  }

  public MainPage open() {
    this.webDriver.get("https://automationteststore.com/");
    return this;
  }

  public MainPage search(String text) {
    this.searchInput.sendKeys(text + Keys.ENTER);
    return this;
  }

  public List<WebElement> getResults() {
    return this.results;
  }
}

