package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //ELEMENTS

    private By firstNameField = By.id("customer.firstName");
    private By lastNameField = By.id("customer.lastName");
    private By addressField = By.id("customer.address.street");
    private By cityField = By.id("customer.address.city");
    private By stateField = By.id("customer.address.state");
    private By zipCodeField = By.id("customer.address.zipCode");
    private By phoneField = By.id("customer.phoneNumber");
    private By sSNField = By.id("customer.ssn");
    private By userNameField = By.id("customer.username");
    private By passwordField = By.id("customer.password");
    private By ConfirmPasswordField = By.id("repeatedPassword");
    private By registerButton = By.xpath("//input[@value='Register']");
    private By welcomeText = By.xpath("//div[@id=\"rightPanel\"]");

    public By getWelcomeText(){return welcomeText;}

    //ACTIONS
    public void register(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String sSN, String userName, String password, String ConfirmPassword) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(sSNField).sendKeys(sSN);
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
        driver.findElement(registerButton).click();

    }
}

