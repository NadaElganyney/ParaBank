package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

@Test
public class BillPayTest extends BaseTest{
    public void billPay(){

        new LoginPage(driver).login("Nada123", "Nada123").payBillLink().payBill("Nada","faisal", "Giza", "Egypt", "21221","01000000000","123456", "123456","500");

        BillPayPage billPayPage = new BillPayPage(driver);

        boolean isConfirmationTextDisplayed = driver.findElement(billPayPage.getConfirmationText()).isDisplayed();
        Assert.assertTrue(isConfirmationTextDisplayed);

    }
}
