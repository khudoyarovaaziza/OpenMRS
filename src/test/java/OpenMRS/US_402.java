package OpenMRS;

import Pages.openMRSpage;
import Utilitis.ConfigReader;
import Utilitis.TestData;
import Utilitis.UIHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utilitis.WebDriverFactory.getDriver;

public class US_402 {
    openMRSpage DemoMRS = new openMRSpage();
    UIHelpers uiHelpers = new UIHelpers();
    @BeforeMethod
    public void setUp() {
        getDriver().get(ConfigReader.getProperty("automationexercise"));
    }
    @Test(dataProvider = "loginPositiveDataCorrect", dataProviderClass = TestData.class)
    public void loginCorrect(String username, String password) {
        DemoMRS.DEMOOpenButton.click();
        uiHelpers.waitInSeconds(2);
        uiHelpers.scrollToElementJsExecutor(DemoMRS.selectExploreOpenMRS2Button);
        uiHelpers.waitInSeconds(4);
        DemoMRS.OpenMRS2DemoButton.click();
        uiHelpers.waitInSeconds(4);
        DemoMRS.UserNameTextBox.sendKeys(username);
        DemoMRS.passwordTextBox.sendKeys(password);;
        DemoMRS.ChooseLocationLaboratory.click();
        DemoMRS.loginInButton.click();
    }
}