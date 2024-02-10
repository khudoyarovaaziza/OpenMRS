package OpenMRS;

import Pages.AutomationExercisePage;
import Utilitis.ConfigReader;
import Utilitis.TestData;
import Utilitis.UIHelpers;
import Utilitis.WebDriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_401 {
    AutomationExercisePage DemoMRS = new AutomationExercisePage();

    @BeforeMethod
    public void setUp() {

        WebDriverFactory.getDriver().get(ConfigReader.getProperty("automationexercise"));
    }

    @Test(dataProvider = "loginPositiveData", dataProviderClass = TestData.class)
    public void loginPageValidEmailValidPass(String username, String password) {
        DemoMRS.DEMOOpenButton.click();
        UIHelpers.waitInSeconds(2);
        UIHelpers.scrollToElementJsExecutor(DemoMRS.OpenMRS2DemoButton);
        UIHelpers.clickOnElementJsExecutor(DemoMRS.OpenMRS2DemoButton);
//        DemoMRS.UserNameTextBox.sendKeys(username);
//        DemoMRS.passwordTextBox.sendKeys(password);
//        DemoMRS.ChooseLocationLaboratory.click();
//        DemoMRS.loginInButton.click();

    }
}

/*
8. Receives [*You must choose a location!*] warning.
9. Can view and click on location sections in Customer Data.
10. Clicks on [*Inpatient Ward*].
11. Enters invalid credentials again from Customer Data.
12. Clicks the "**Login**" button.
13. Receives [*Invalid username/password. Please try again.*] warning.
14. Optionally, the user successfully logs in with valid data.
*
*
* -------------------------------
* ## Acceptance Criteria (AC_02)
1. The user navigates to the home page.
2. Clicks on the [*DEMO*] button.
3. Selects [*Explore OpenMRS 2*].
4. Clicks on [*Enter the OpenMRS 2 Demo*].
5. Navigates to the login page.
6. Enters the valid username and password from Customer Data.
7. Clicks on the desired [Location] button for login.
8. After entering the valid username and password, the user can log in to their registered user account by clicking the "**Login**" button.
*/