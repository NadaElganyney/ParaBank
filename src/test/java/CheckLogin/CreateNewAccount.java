package CheckLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.OpenNewAccountPage;

public class CreateNewAccount extends BaseTest {
    @Test
    public void createAccount() {
        new LoginPage(driver).login("Nada123", "Nada123").openNewAccountLink();
        OpenNewAccountPage openNewAccountPage = new OpenNewAccountPage(driver);
        boolean isOpenNewAccountConfirmationTextDisplayed = driver.findElement(openNewAccountPage.getOpenNewAccountConfirmationText()).isDisplayed();
        Assert.assertTrue(isOpenNewAccountConfirmationTextDisplayed);
    }



}
