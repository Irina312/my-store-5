import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static utils.SeleniumUtils.switchToWindowAndVerifyTitle;

public class TempFollowUs extends BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://twitter.com/seleniumfrmwrk");
    }
    @Test()
    public void test01(){

        driver.findElement(By.xpath("//*[@class='facebook']")).click();

    }
    @Test()
    public void test02(){

        System.out.println(driver.getTitle());
    }
}
