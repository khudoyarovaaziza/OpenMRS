package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_410TimeZone {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.openmrs.org/openmrs/login.htm");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
            usernameInput.sendKeys("Admin");

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
            passwordInput.sendKeys("Admin123");

            WebElement LocationButton = driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]"));
            LocationButton.click();

            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
            loginButton.click();

            WebElement appointmentSchedulingButton = driver.findElement(By.xpath("//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]"));
            appointmentSchedulingButton.click();

            WebElement manageAppointmentsButton = driver.findElement(By.xpath("//*[@id=\"appointmentschedulingui-manageAppointments-app\"]"));
            manageAppointmentsButton.click();

            WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"patient-search\"]"));
            searchInput.sendKeys("Oguzhan Erdekli");
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).build().perform();

            try {
                System.out.println("15 second interval");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"time-zone-warning\"]/div"));
            String errorText = errorMessage.getText();
            if (errorText.contains("Your computer is not set to the right time zone.")) {
                System.out.println("Timezone-related error message is displayed: " + errorText);
            } else {
                System.out.println("Timezone-related error message is not displayed.");
            }

            driver.quit();
        }
    }

