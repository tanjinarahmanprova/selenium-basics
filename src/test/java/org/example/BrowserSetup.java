package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BrowserSetup {
    public WebDriver browser;

    @BeforeSuite //This annotation marks a method that should be run before all tests in the suite
    public void startBrowser(){
        //opens browser
        browser = new ChromeDriver();
    }

    @AfterSuite //This annotation marks a method that should be run after all tests in the suite
    public void quiteBrowser(){
        //closes the browser
        browser.quit();
    }

    public WebElement getElement(By locator) {
        return browser.findElement(locator);
    }

    //Click on element
    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public String getText(By locator){
        return getElement(locator).getText();
    }


    // Writes on a element
    public void writeOnElement(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    // checks if element is selected or not
    public Boolean selectedStatus(By locator){
        return getElement(locator).isSelected();
    }

    // checks if element is displayed or not
    public Boolean displayStatus(By locator){
        return getElement(locator).isDisplayed();
    }

    //checks if element is enable or disable
    public Boolean enableStatus(By locator){
        return getElement(locator).isEnabled();
    }

    //clear element
    public void clearElement(By locator){
        getElement(locator).clear();
    }
}
