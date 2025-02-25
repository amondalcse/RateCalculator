package com.ratecalculator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DashboardPage {
    WebDriver driver;

    By weight = By.xpath("//input[@formcontrolname='itemWeight']");
    By postalCode = By.xpath("//input[@placeholder='Postcode']");
    By button = By.xpath("//a[@type=' button']");
    By selectCountry = By.xpath("//input[@placeholder='Select country']");
    By selectAlloptions =By.xpath("//div[@role='listbox']/mat-option");
    By verifyTitle = By.xpath("//dt[text()='Service Type']/..//dd");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void selectCountry(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(selectCountry));
        dropdown.click();
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(selectCountry));
        searchBox.clear();
        searchBox.sendKeys("India");
        WebElement indiaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[@title='India - IN']")));
        indiaOption.click();
        String selectedValue = dropdown.getText();
        if (selectedValue.contains("India - IN")) {
            System.out.println("India was selected successfully!");
        } else {
            System.out.println("Selection failed!");
        }

    }
    public void enterWeight(String no){
        try{
            driver.findElement(weight).sendKeys(no);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void enterPostalCode(String no){
        try{
            driver.findElement(postalCode).sendKeys(no);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void clickbutton(){
        try{
            driver.findElement(button).click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void verifytheTitle(){
        List<WebElement> serviceTypes =driver.findElements(verifyTitle);
        String[] expectedServiceTypes = {
                "Express Mail Service (EMS)",
                "International Air Parcel",
                "International Surface Parcel"};
        System.out.println(expectedServiceTypes.length);
        for (int i = 0; i < serviceTypes.size(); i++) {
            String actualService = serviceTypes.get(i).getText();
            System.out.print("actual services "+ actualService);
            Assert.assertEquals(actualService, expectedServiceTypes[i], "Service type mismatch at index: " + i);
        }
    }

}

