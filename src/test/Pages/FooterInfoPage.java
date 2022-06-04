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
    @FindBy(xpath = "//li[@class='item']")
    public List<WebElement> footerInfoList;

    @FindBy(xpath = "//a[@title='Sitemap']")
    public WebElement siteMap;
}
