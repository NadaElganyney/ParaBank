package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateInfoPage {
    private WebDriver driver;

    public UpdateInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By firstNameUpdateField = By.xpath("//input[@id='customer.firstName']");
    private By lastNameUpdateField = By.id("customer.lastName");
    private By adressUpdateField = By.id("customer.address.street");
    private By cityUpdateField = By.id("customer.address.city");
    private By stateUpdateField = By.id("customer.address.state");
    private By postalcodeUpdateField = By.id("customer.address.zipCode");
    private By phoneUpdateField = By.id("customer.phoneNumber");
    private By updateProfileButton = By.xpath("//input[@value='Update Profile']");
private  By updateInfoConfirmationText = By.xpath("//div[@ng-if='showResult']");

public By getUpdateInfoConfirmationText() {
        return updateInfoConfirmationText;
    }

    //actions
    public void updateFirstname(String firstname, String lastName, String adress, String city, String state, String postalCode, String phone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.findElement(firstNameUpdateField).sendKeys(firstname);
        driver.findElement(lastNameUpdateField).sendKeys(lastName);
        driver.findElement(adressUpdateField).sendKeys(adress);
        driver.findElement(cityUpdateField).sendKeys(city);
        driver.findElement(stateUpdateField).sendKeys(state);
        driver.findElement(postalcodeUpdateField).sendKeys(postalCode);
        driver.findElement(phoneUpdateField).sendKeys(phone);

        driver.findElement(updateProfileButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(updateInfoConfirmationText));    }
}
