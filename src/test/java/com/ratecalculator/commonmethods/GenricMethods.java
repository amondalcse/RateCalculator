package com.ratecalculator.commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class GenricMethods
{
    public void clickElement(WebDriver driver, By by){
        try{
            driver.findElement(by).click();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    public void enterTextFields(WebDriver driver, String ele, By by){
        try{
            driver.findElement(by).clear();
            driver.findElement(by).sendKeys(ele);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
    public String verifyTtitle(WebDriver driver){
        String title = driver.getTitle();
        return title;
    }

    public static String getRootDirectory() {
        File path = new File("");
        String absolPath = path.getAbsolutePath();
        File dir = new File(absolPath);
        String rootDir = dir.getParent();
        return rootDir;

    }
    public static void selectDropDown(WebDriver driver, By by,String ele){
        try{

        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
