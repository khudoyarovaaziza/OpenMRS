package OpenMRS;

import Pages.openMRSpage;
import Utilitis.ConfigReader;
import Utilitis.TestData;
import Utilitis.UIHelpers;
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
        uiHelpers.waitInSeconds(2);

       uiHelpers.scrollToElementJsExecutor(DemoMRS.OpenMRS2DemoButton);
       DemoMRS.OpenMRS2DemoButton.click();
        uiHelpers.waitInSeconds(2);
       // Assert.assertTrue(DemoMRS.UserNameTextBox.isDisplayed());
        openMRSpage openMRSpage = new openMRSpage();


        DemoMRS.UserNameTextBox.sendKeys(username);
//      DemoMRS.UserNameTextBox.click();
//      DemoMRS.passwordTextBox.sendKeys(password);
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

*/