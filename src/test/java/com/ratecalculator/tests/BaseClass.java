package com.ratecalculator.tests;
import com.ratecalculator.utility.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import  static com.ratecalculator.utility.PropertyFileReader.config;



public class BaseClass
{
    public WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void openBrowser(String br) throws InterruptedException {

        PropertyFileReader.loadProperties();
        if(br.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else{
            driver = new SafariDriver();
            driver.manage().window().maximize();

        }

        String base_url = config.getProperty("url");
        Thread.sleep(3000);
        driver.get(base_url);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
