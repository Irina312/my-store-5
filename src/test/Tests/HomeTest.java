package Tests;

import Pages.HomePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }



}

//  Verify all links on the homepage of the application are taken to the expected page
//  by using the title of the target website.
//  Requirement: Use data providers.
