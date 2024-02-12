package OpenMRS;

import Pages.openMRSpage;
import Utilitis.ConfigReader;
import Utilitis.TestData;
import Utilitis.UIHelpers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utilitis.WebDriverFactory.getDriver;

public class US_402 {
    /*

     3. Selects [*Explore OpenMRS 2*].
     4. Clicks on [*Enter the OpenMRS 2 Demo*].
     5. Navigates to the login page.
     6. Enters the valid username and password from Customer Data.
     7. Clicks on the desired [Location] button for login.
     8. After entering the valid username and password, the user can log in to their registered user account by clicking the "**Login**" button.
     */

    openMRSpage DemoMRS = new openMRSpage();
    UIHelpers uiHelpers = new UIHelpers();


    @BeforeMethod
    public void setUp() {

        getDriver().get(ConfigReader.getProperty("automationexercise"));
    }

    @Test(dataProvider = "loginPositiveData", dataProviderClass = TestData.class)
    public void loginTestData(String username, String password) {

        openMRSpage openMRSpage = new openMRSpage();

        DemoMRS.DEMOOpenButton.click();
        uiHelpers.waitInSeconds(2);

        uiHelpers.scrollToElementJsExecutor(DemoMRS.selectExploreOpenMRS2Button);
        DemoMRS.selectExploreOpenMRS2Button.click();

        uiHelpers.scrollToElementJsExecutor(DemoMRS.OpenMRS2DemoButton);
        DemoMRS.OpenMRS2DemoButton.click();
        uiHelpers.waitInSeconds(2);
    }
}