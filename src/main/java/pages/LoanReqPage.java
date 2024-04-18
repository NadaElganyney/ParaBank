package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoanReqPage {

    private WebDriver driver;

    public LoanReqPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loanAmountfild = By.id("amount");
    private By downPaymentfield = By.id("downPayment");
    private By fromAccount = By.id("fromAccountId");

    private By ApplyButton = By.xpath("//input[@value='Apply Now']");
    private By loanReqConfirmationText= By.id("loanProviderName");
    public By getLoanReqConfirmationText() {
        return loanReqConfirmationText;}

//actions

    public void loanReq(String amount, String downPayment) {
        Select select = new Select(driver.findElement(fromAccount));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        select.selectByIndex(0);
        driver.findElement(loanAmountfild).sendKeys(amount);
        driver.findElement(downPaymentfield).sendKeys(downPayment);
        driver.findElement(ApplyButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(loanReqConfirmationText));
    }
}


