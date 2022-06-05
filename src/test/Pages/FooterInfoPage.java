package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class FooterInfoPage extends BasePage {

    protected WebDriver driver;

    public FooterInfoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//ul[@class='toggle-footer'])[1]")
    public List<WebElement> footerInfoList;

    @FindBy(css = "a[title='Specials']")
    public WebElement specials;

    @FindBy(css = "a[title='New products']")
    public WebElement newProduct;

    @FindBy(css = "a[title='Best sellers']")
    public WebElement bestSellers;

    @FindBy(css = "a[title='Our stores']")
    public WebElement ourStores;

    @FindBy(css = "a[title='Contact us']")
    public WebElement contactUs;

    @FindBy(css = "a[title='Terms and conditions of use']")
    public WebElement termsConditions;

    @FindBy(css = "a[title='About us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[@title='Sitemap']")
    public WebElement siteMap;
}
