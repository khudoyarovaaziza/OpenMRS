import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class US_407 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize the driver using the WebDriverFactory
        driver = WebDriverFactory.getDriver();
        // Navigate to the specified OpenMRS login page
        driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");
        // Login process
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Admin123");
        driver.findElement(By.id("Inpatient Ward")).click();
        driver.findElement(By.className("loginButton")).click();
    }

    @Test
    public void testDeletePatient() {
        // Navigate to the "Find Patient Record" section
        driver.findElement(By.xpath("//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")).click();
        // Search for the patient
        driver.findElement(By.xpath("//*[@id=\"patient-search\"]")).click();
        // Select the patient from search results
        driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr[2]/td[2]")).click();
        // Initiate the deletion process
        driver.findElement(By.xpath("//*[@id=\"org.openmrs.module.coreapps.deletePatient\"]/div/div[2]")).click();
        driver.findElement(By.xpath("//input[@id='delete-reason']")).sendKeys("Duplicate record");
        driver.findElement(By.className("confirm")).click();

        // Assertion to verify successful deletion
        // Note: This step assumes there is a confirmation message, adjust according to your application's behavior
        boolean deletionConfirmed = driver.findElement(By.xpath("//p[contains(text(),'Patient deleted successfully')]")).isDisplayed();
        Assert.assertTrue(deletionConfirmed, "Patient was not deleted successfully.");
    }

    @AfterMethod
    public void tearDown() {
        // Use the WebDriverFactory to close or quit the driver
        WebDriverFactory.quitDriver();
    }
}

