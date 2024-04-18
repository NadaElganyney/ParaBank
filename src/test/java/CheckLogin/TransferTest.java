package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransferPage;

@Test
public class TransferTest extends BaseTest{

    public void validTransfer() {
     new LoginPage(driver).login("Nada123", "Nada123").transferLink().transfer("100");
        TransferPage transferPage= new TransferPage(driver);
boolean isTransferConfirmed = driver.findElement(transferPage.getTransferConfirmationText()).isDisplayed();
      Assert.assertTrue(isTransferConfirmed);
    }
}
