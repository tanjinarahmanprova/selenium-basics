package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup{
    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        //getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh"); //send keys to an element
        writeOnElement(By.xpath("//input[@id='autocomplete']"), "Bangladesh");
        String text = getText(By.xpath("//legend[normalize-space()='Dropdown Example']")); //get text of an element
        System.out.println(text);
        Thread.sleep(1000);
        getElement(By.xpath("//input[@id='autocomplete']")).clear(); //clears an element
        Thread.sleep(1000);
        //getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Nepal");
        writeOnElement(By.xpath("//input[@id='autocomplete']"), "Nepal");
        text = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder"); //get value of attribute
        System.out.println(text);
        text = getElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color"); //get CSS attribute value
        System.out.println(text);
        Boolean isSelected = selectedStatus(By.xpath("//input[@id='checkBoxOption2']")); //checks option is selected or not
        System.out.println(isSelected);
        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelected = selectedStatus(By.xpath("//input[@id='checkBoxOption2']")); //checks if element is selected or not
        System.out.println(isSelected);
        System.out.println("---------------------------------------------------------------------------");
        Boolean isDisplayed = displayStatus(By.xpath("//input[@id='displayed-text']")); //checks if element is displayed or not
        System.out.println(isDisplayed);
        getElement(By.id("hide-textbox")).click();
        isDisplayed = displayStatus(By.xpath("//input[@id='displayed-text']"));  //checks if element is displayed or not
        System.out.println(isDisplayed);
        System.out.println("---------------------------------------------------------------------------");
        browser.switchTo().newWindow(WindowType.TAB);
        browser.get("https://www.google.co.uk/");
        Boolean isEnable = enableStatus(By.xpath("//textarea[@id='APjFqb']"));
        System.out.println(isEnable);
        Thread.sleep(1000);

    }
}
