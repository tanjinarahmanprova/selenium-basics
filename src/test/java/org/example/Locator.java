package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator extends BrowserSetup{
    @Test //This annotation marks a method as a test method
    public void testPage() throws InterruptedException {
        //open webpage in browser
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //locates with id
        WebElement autocompleteTextBox = browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Hello");
        //locates with name
        browser.findElement(By.name("checkBoxOption1")).click();
        //locates with class name
        browser.findElement(By.className("radioButton") ).click();
        //locates with tag name
        WebElement title = browser.findElement(By.tagName("h1"));
        System.out.println(title.getText()); //getText() is used to know what text was written there
        Thread.sleep(2000);//holds browser for 2 sce
        //locates with Standard CSS selector, CSS selector Expression -> tag_name[attribute_name='attribute_value']
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(2000);
        //locates with Xpath, Xpath Expression ->//tag_name[@attribute_name='attribute_value']
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(2000);
        //locates with link text
        //browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        //locates with partial link text
        browser.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
        Thread.sleep(5000);
    }
}
