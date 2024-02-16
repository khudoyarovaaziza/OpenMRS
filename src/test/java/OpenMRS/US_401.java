package OpenMRS;

import Pages.openMRSpage;
import Utilitis.ConfigReader;
import Utilitis.TestData;
import Utilitis.UIHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utilitis.WebDriverFactory.getDriver;


public class US_401 {
    openMRSpage DemoMRS = new openMRSpage();
    UIHelpers uiHelpers =  new UIHelpers();
    @BeforeMethod
    public void setUp() {

        getDriver().get(ConfigReader.getProperty("automationexercise"));
    }
    @Test(dataProvider = "loginPositiveData", dataProviderClass = TestData.class)
    public void loginTestData(String username, String password) {
        DemoMRS.DEMOOpenButton.click();
        uiHelpers.scrollToElementJsExecutor(DemoMRS.selectExploreOpenMRS2Button);
        DemoMRS.OpenMRS2DemoButton.click();
        uiHelpers.waitInSeconds(4);
        DemoMRS.UserNameTextBox.sendKeys(username);
        DemoMRS.passwordTextBox.sendKeys(password);
        uiHelpers.waitInSeconds(4);
        Assert.assertTrue(DemoMRS.youMustChooseLocation.isDisplayed());
        getDriver().navigate().refresh();
        uiHelpers.waitInSeconds(4);
        DemoMRS.inpatientWardButton.click();
         DemoMRS.loginInButton.click();


    }
}