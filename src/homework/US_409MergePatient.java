package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class US_409MergePatient {
        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.openmrs.org/openmrs/login.htm");

            if (driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/login.htm")) {
                System.out.println("Homepage URL verification successful");
            } else {
                System.out.println("Homepage URL verification unsuccessful");
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
            usernameInput.sendKeys("Admin");

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
            passwordInput.sendKeys("Admin123");

            WebElement LocationButton = driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]"));
            LocationButton.click();

            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
            loginButton.click();

            WebElement dataManagementLink = driver.findElement(By.xpath("//*[@id=\"coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension\"]"));
            dataManagementLink.click();

            WebElement MergeButton = driver.findElement(By.xpath("//*[@id=\"coreapps-mergePatientsHomepageLink-app\"]"));
            MergeButton.click();


            WebElement id1Field = driver.findElement(By.xpath("//*[@id=\"patient1-text\"]"));
            id1Field.sendKeys("1000PE");
            WebElement id2Field = driver.findElement(By.xpath("//*[@id=\"patient2-text\"]"));
            id2Field.sendKeys("1000GW");

            WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"confirm-button\"]"));
            continueButton.click();

            WebElement SelectPReferred = driver.findElement(By.xpath("//*[@id=\"second-patient\"]"));
            SelectPReferred.click();

            WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"confirm-button\"]"));
            confirmButton.click();

            //driver.quit();
        }
}