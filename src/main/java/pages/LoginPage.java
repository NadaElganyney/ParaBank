package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;}

        //elements
        private By usernameField = By.xpath("//input[@name='username']");
        private By passwordField = By.xpath("//input[@name='password']");
    private By logInButton = By.xpath("//input[@value='Log In']");
    private By registerLink = By.xpath("//a[text()='Register']");
    private By loginConfirmationText = By.xpath("//div[@ng-app='OverviewAccountsApp']");

    public By getloginConfirmationText() {
        return loginConfirmationText;
    }

    //actions
        public RegisterPage clickOnRegister() {

            driver.findElement(registerLink).click();
            return new RegisterPage(driver);
        }
        public HomePage login(String userName, String password){
            driver.findElement(usernameField).sendKeys(userName);
            driver.findElement(passwordField).sendKeys(password);
            driver.findElement(logInButton).click();
            return new HomePage(driver);

        }
    }

