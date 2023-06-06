package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.MainPage;
import testconfigs.BaseTest;

public class TestAutomationStoreTests extends BaseTest {

  @Test
  public void search() {
    MainPage mainPage = new MainPage(webDriver);
    Assert.assertTrue(
        mainPage.open().search("SANDALS").getResults().get(0).getText().contains("SANDALS"));
  }
}
