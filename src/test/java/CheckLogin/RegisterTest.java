package CheckLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

    @Test

public void validRegister(){
LoginPage loginpage = new LoginPage(driver);
        loginpage.clickOnRegister();
        new RegisterPage(driver).register("Nada", "Mohamed", "Faisal", "Giza", "Egypt", "21221", "01000000000", "123", "Nada123","Nada123","Nada123");
        RegisterPage registerPage = new RegisterPage(driver);

        boolean isTextDisplayed= driver.findElement(registerPage.getWelcomeText()).isDisplayed();
        Assert.assertTrue(isTextDisplayed);


    }
}
