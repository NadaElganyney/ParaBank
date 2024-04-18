package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {
    private WebDriver driver;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
    }
//elements
    private By amountField = By.xpath("//input[@id='amount']");
    private By fromAccount = By.xpath("//select[@id='fromAccountId']");
    private By toAccount = By.xpath("//select[@id='toAccountId']");
    private By transferButton = By.xpath("//input[@value='Transfer']");
    private By transferConfirmationText = By.xpath("//span[@id='amount']");

    public By getTransferConfirmationText() {
        return transferConfirmationText;
    }

    //actions
    public void transfer(String amount){
        Select select = new Select(driver.findElement(fromAccount));
        Select select2 = new Select(driver.findElement(toAccount));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        select.selectByIndex(0);
        select2.selectByIndex(0);
        driver.findElement(amountField).sendKeys(amount);

        driver.findElement(transferButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(transferConfirmationText));

    }
}
