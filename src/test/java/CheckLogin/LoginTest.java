package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
@Test
    public void validLogin(){

         new LoginPage(driver).login("Nada123", "Nada123");
         LoginPage loginPage = new LoginPage(driver);
         boolean isloginConfirmationTextdisplayed = driver.findElement(loginPage.getloginConfirmationText()).isDisplayed();
    Assert.assertTrue(isloginConfirmationTextdisplayed);

    }
}
