package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UpdateInfoPage;

@Test
public class UpdateInfoTest extends BaseTest{
    public void validUpdateInfoTest() {
        new LoginPage(driver).login("Nada123", "Nada123").updateContactInfoLink().updateFirstname("Nada1","Nada", "faisal", "giza", "Egypt", "12345","01000000000");
        UpdateInfoPage updateInfoPage = new UpdateInfoPage(driver);
        boolean updateInfoConfirmationTextDisplayed = driver.findElement(updateInfoPage.getUpdateInfoConfirmationText()).isDisplayed();
        Assert.assertTrue(updateInfoConfirmationTextDisplayed);
    }

    }
