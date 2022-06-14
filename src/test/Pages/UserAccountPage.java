package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserAccountPage extends BasePage {

    UserAccountPage userAccountPage;

    public UserAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='bullet']")
    public List<WebElement> userAcc;

    @FindBy(css = "a[title='My orders']")
    public WebElement myOrders;

    @FindBy(css = "a[title='My credit slips']")
    public WebElement creditSlips;

    @FindBy(css = "a[title='My addresses']")
    public WebElement myAddresses;

    @FindBy(css = "a[title='Manage my personal information']")
    public WebElement personalInfo;

    @FindBy(xpath = "//span[@class='navigation_page']")
    public WebElement loginPage;
}
