package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenNewAccountPage {
    private WebDriver driver;

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements

    private By accountTypeMenu= By.xpath("//select[@ng-model='types.selectedOption']");
    private By existingAccount = By.xpath("//select[@ng-model='accounts.selectedOption']");
   private By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
   private By openNewAccountConfirmationText = By.xpath("//div[@ng-app='AddAccountApp']");
    private org.openqa.selenium.WebElement WebElement;
    public By getOpenNewAccountConfirmationText() {
        return openNewAccountConfirmationText;
    }


    //actions

    public void openNewAccount() {
        Select select = new Select(driver.findElement(existingAccount));
        Select select2 = new Select(driver.findElement(accountTypeMenu));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        select.selectByIndex(0);
        select2.selectByIndex(1);
        driver.findElement(openNewAccountButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(openNewAccountConfirmationText));

}
}
