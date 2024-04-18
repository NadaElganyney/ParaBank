package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By openNewAccountButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[1]/a");
    private By transferButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[3]/a");
    private By payBillButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[4]/a");
    private By updateContactInfoButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[6]/a");
    private By requestLoanButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[7]/a");
    private By logOutButton = By.xpath("//div[@id=\"leftPanel\"]/ul/li[8]/a");


    //actions

    public BillPayPage payBillLink() {
        driver.findElement(payBillButton).click();
        return new BillPayPage(driver);
    }

    public TransferPage transferLink() {
        driver.findElement(transferButton).click();
        return new TransferPage(driver);
    }

    public OpenNewAccountPage openNewAccountLink() {
        driver.findElement(openNewAccountButton).click();
        return new OpenNewAccountPage(driver);
    }

    public UpdateInfoPage updateContactInfoLink() {
        driver.findElement(updateContactInfoButton).click();
        return new UpdateInfoPage(driver);
    }

    public LoanReqPage requestLoanLink() {
        driver.findElement(requestLoanButton).click();
        return new LoanReqPage(driver);
    }
}
