package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleiFrame extends BrowserSetup{
    @Test
    public void testiFrame() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)browser;

        WebElement scrollToElement = getElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollToElement); //scroll to element
        Thread.sleep(1000);
        //browser.switchTo().frame("courses-iframe"); //switch to iFrame by id
        //browser.switchTo().frame("iframe-name");  //switch to iFrame by name
        //browser.switchTo().frame(getElement(By.id("courses-iframe")));  //switch to iFrame by locator
        browser.switchTo().frame(0);  //switch to iFrame by index
        getElement(By.xpath("//a[normalize-space()='Register']"));
        Thread.sleep(1000);
        //browser.switchTo().parentFrame();  //switch to parent frame
        browser.switchTo().defaultContent();  //switch to default content
        getElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        Thread.sleep(1000);

    }
}
