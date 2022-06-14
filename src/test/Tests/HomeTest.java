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

    public void addToCart() {
        // add the first item
        homePage.moveToMyElement(homePage.shirtItem);
        homePage.addToCart.click();
        homePage.click(homePage.continueShoppingBtn);

        // add the second item
        homePage.moveToMyElement(homePage.blouseItem);
        homePage.addToCart.click();
        homePage.click(homePage.continueShoppingBtn);

        homePage.moveToMyElement(homePage.viewCart);
        Assert.assertTrue(homePage.shirtItem.getText().equals(homePage.actualShirt.getAttribute("title"))&&
                homePage.blouseItem.getText().equals(homePage.actualBlouse.getAttribute("title"))&&
                homePage.expectedTotalPrice.equals(homePage.smallCartTotalPrice.getText()));
    }
}

    /*
    When a user adds few items in the cart, he'd like a small
    cart view on the main page available to see what was added
    & a sum of items' prices should be correct.
    NOTE: Very small cart view & full cart view have
    the same items & total amount is the same
     */


