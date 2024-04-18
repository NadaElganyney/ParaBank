package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoanReqPage;
import pages.LoginPage;

@Test
public class ReqLoanTest extends BaseTest{

    public void validLoanReq(){

new LoginPage(driver).login("Nada123", "Nada123").requestLoanLink().loanReq("200","10");
        LoanReqPage loanReqPage= new LoanReqPage(driver);

        boolean isLoanReqConfirmationTextDisplayed = driver.findElement(loanReqPage.getLoanReqConfirmationText()).isDisplayed();
        Assert.assertTrue(isLoanReqConfirmationTextDisplayed);
    }
}
