package Pages;

import Utilitis.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class openMRSpage {
    public openMRSpage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }
// You can create your own
    @FindBy(xpath = ("(//a[@class='zak-button'])[1]"))
    public WebElement DEMOOpenButton;
    @FindBy(xpath = ("//span[contains(text(),'Enter the OpenMRS 2 Demo')]"))
    public WebElement OpenMRS2DemoButton;
    @FindBy(xpath = ("(//span[contains(text(),'Explore OpenMRS 2')])[1]"))
    public WebElement selectExploreOpenMRS2Button;

    @FindBy(id = ("username"))
    public WebElement UserNameTextBox;

    @FindBy(id = ("password"))
    public WebElement passwordTextBox;

    @FindBy(xpath = ("//li[@id='Laboratory']"))
    public WebElement ChooseLocationLaboratory;
    @FindBy(xpath = ("//input[@id='loginButton']"))
    public WebElement loginInButton;
    @FindBy(xpath = ("(//li[@id='Inpatient Ward'])[1]"))
    public WebElement inpatientWardButton;

    @FindBy(xpath = ("//label[@for='sessionLocation']"))
    public WebElement youMustChooseLocation;

    @FindBy(xpath = ("("))
    public WebElement gfhfhfhfh ;

    @FindBy(xpath = ("("))
    public WebElement passwordSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement firstNameSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement lastNameSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement companySignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement countrySignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement stateSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement zipCodeSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement mobileNoSignUpTextBox;

    @FindBy(xpath = ("("))
    public WebElement createAccountSignUpButton;
    @FindBy (xpath = ("("))
    public WebElement addressSignUpTextBox;
    @FindBy (xpath = ("("))
    public WebElement citySignUpTextBox;


}
