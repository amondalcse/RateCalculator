package com.ratecalculator.tests;

import com.ratecalculator.pages.DashboardPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DashBoardTest extends BaseClass
{
    @Test
    public void checkRateCalculator() throws InterruptedException {
        DashboardPage page = new DashboardPage(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,900)");
        //page.selectCountry(driver,"India - IN");
        page.selectCountry(driver);
        Thread.sleep(3000);
        page.enterPostalCode("35600");
        page.enterWeight("1");
        Thread.sleep(3000);
        page.clickbutton();
        Thread.sleep(3000);
        page.verifytheTitle();
    }

}
