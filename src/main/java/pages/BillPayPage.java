package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BillPayPage {
    private WebDriver driver;

    public BillPayPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By payeeNamefield= By.xpath("//input[@name='payee.name']");
    private By payeeAdressfield=By.xpath("//input[@name='payee.address.street']");
    private By payeeCityfield=By.name("payee.address.city");
    private By payeeStatefield=By.name("payee.address.state");
    private By payeeZipCodefield=By.name("payee.address.zipCode");
    private By payeePhonefield=By.name("payee.phoneNumber");
    private By payeeAccountfield=By.name("payee.accountNumber");
    private By verifyPayeeAccountfield=By.name("verifyAccount");
    private By amountfield=By.name("amount");
    private By sendPaymentButon = By.xpath("//input[@class='button']");
    private By confirmationText = By.xpath("//span[@id='amount']");

    public By getConfirmationText() {
        return confirmationText;
    }

    //actions
    public void payBill(String name, String adress, String City, String State, String Postal, String Phone, String Account, String verify, String amount){
        driver.findElement(payeeNamefield).sendKeys(name);
        driver.findElement(payeeAdressfield).sendKeys(adress);
        driver.findElement(payeeCityfield).sendKeys(City);
        driver.findElement(payeeStatefield).sendKeys(State);
        driver.findElement(payeeZipCodefield).sendKeys(Postal);
        driver.findElement(payeePhonefield).sendKeys(Phone);
        driver.findElement(payeeAccountfield).sendKeys(Account);
        driver.findElement(verifyPayeeAccountfield).sendKeys(verify);
        driver.findElement(amountfield).sendKeys(amount);
        driver.findElement(sendPaymentButon).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationText));

    }




}
