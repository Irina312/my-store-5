package Tests;

import Pages.UserAccountPage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserAccountTest extends BaseTest {
    UserAccountPage userAccountPage;

    @BeforeMethod
    public void localSetUp() {
        userAccountPage = new UserAccountPage(getDriver());
    }

    @DataProvider(name = "User account data")
    public Object[] testdata() {
        Object[] data = new Object[4];
        data[0] = "My orders";
        data[1] = "My credit slips";
        data[2] = "My addresses";
        data[3] = "My personal info";
        return data;
    }

    @Test(testName = "Verify Account sections")
    public void test01() {

        userAccountPage.myOrders.click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='navigation_page']")).isDisplayed());

        userAccountPage.creditSlips.click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='navigation_page']")).isDisplayed());

        userAccountPage.myAddresses.click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='navigation_page']")).isDisplayed());

        userAccountPage.personalInfo.click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='navigation_page']")).isDisplayed());

    }
}

