package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowUsPage extends BasePage {
    protected WebDriver driver;

    public FollowUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="social_block")
    public static WebElement followBtn;

    @FindBy(xpath = "//*[@class='facebook']")
    public WebElement facebookBtn;

    @FindBy(xpath = "//*[@class='twitter']")
    public WebElement twittwrBtn;

    @FindBy(xpath = "//*[@class='youtube']")
    public WebElement youtubeBtn;

    @FindBy(xpath = "//*[@class='google-plus']")
    public WebElement googleBtn;
}
