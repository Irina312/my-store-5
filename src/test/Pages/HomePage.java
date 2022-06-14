package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingBtn;

    @FindBy (xpath = "//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")
    public WebElement shirtItem;

    public String expectedTotalPrice = "$" + (Math.round((16.51 + 26.00 + 2.00) * 100.0) / 100.0);

    @FindBy (xpath = "//a[@class='product-name' and @title='Blouse']")
    public WebElement blouseItem;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    public WebElement viewCart;

    @FindBy (linkText = "Add to cart")
    public WebElement addToCart;

    @FindBy (xpath = "//div[@class='cart-info']//div[@class='product-name']//a[contains (@title, 'Faded')]")
    public WebElement actualShirt;

    @FindBy (xpath = "//div[@class='cart-info']//div[@class='product-name']//a[contains (@title, 'Printed Dress')]")
    public WebElement actualBlouse;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    public WebElement cartBtn;

    @FindBy (xpath = "//span[@class='price cart_block_total ajax_block_cart_total']")
    public WebElement smallCartTotalPrice;

    @FindBy (xpath = "//a[@title='Contact Us']")
    public WebElement contactUsBtn;

    @FindBy (linkText = "Sign in")
    public WebElement signInBtn;

    @FindBy (xpath = "//a[@class='fancybox-item fancybox-close']")
    public WebElement closeBtn;

    @FindBy (linkText = "Quick view")
    public WebElement quickViewBtn;

    @FindBy (xpath = "(//a[text()='T-shirts'])[2]")
    public WebElement tshirtsSectionBtn;

    public String expectedShirtItemText = "Faded Short Sleeve T-shirts";

    public String expectedDressItemText = "Printed Dress";
}
