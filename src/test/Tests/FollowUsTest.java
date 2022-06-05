package Tests;

import Pages.FollowUsPage;
import Pages.HomePage;
import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

import static utils.SeleniumUtils.switchToWindowAndVerifyTitle;

public class FollowUsTest extends BaseTest {
    FollowUsPage followUsPage;

    @BeforeMethod
    public void localSetUp(){

        followUsPage = new FollowUsPage(getDriver());
    }
    @Test(testName = "AUT-5")
    public void test01(){
        followUsPage.click(followUsPage.facebookBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework");
    }
    @Test(testName = "AUT-5")
    public void test02(){
        followUsPage.click(followUsPage.twittwrBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework (@seleniumfrmwrk) / Twitter");
    }

    @Test(testName = "AUT-5")
    public void test03(){
        followUsPage.click(followUsPage.youtubeBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Selenium Framework - YouTube");
    }

    @Test(testName = "AUT-5")
    public void test04(){
        followUsPage.click(followUsPage.googleBtn);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Sign in - Google Accounts");
    }

}
