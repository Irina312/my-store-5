package Tests;

import Pages.FooterInfoPage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class FooterInfoTest extends BaseTest {
    FooterInfoPage footerInfoPage;

    @BeforeMethod
    public void localSetUp() {
        footerInfoPage = new FooterInfoPage(getDriver());
    }

    @DataProvider(name = "FooterInfo")
    public Object[] testData() {
        Object[] data = new Object[8];
        data[0] = "Specials";
        data[1] = "New products";
        data[2] = "Best sellers";
        data[3] = "Our store";
        data[4] = "Contact us";
        data[5] = "Terms and conditions of use";
        data[6] = "About us";
        data[7] = "Sitemap";

        return data;
    }

    @Test(testName = "Footer Info List varification", dataProvider = "FooterInfo")
    public void test01(String data) {

        boolean footerList = footerInfoPage.footerInfoList.contains(data);

    }
}


