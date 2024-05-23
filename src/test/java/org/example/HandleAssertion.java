package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandleAssertion extends BrowserSetup{
    @Test
    public void testElement() {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        writeOnElement(By.xpath("//input[@id='autocomplete']"), "Bangladesh");
        String text = getText(By.xpath("//legend[normalize-space()='Dropdown Example']")); //get text of an element
        SoftAssert sa = new SoftAssert();  //create an object for SoftAssert class
        sa.assertEquals(text, "Dropdown Example"); //Soft assertion
        //Assert.assertEquals(text, "Dropdown Example");  //Hard assertion
        clearElement(By.xpath("//input[@id='autocomplete']")); //clears an element
        writeOnElement(By.xpath("//input[@id='autocomplete']"), "Nepal");
        text = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder"); //get value of attribute
        sa.assertEquals(text, "Enter Your Name");
        text = getElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color"); //get CSS attribute value
        sa.assertEquals(text, "rgba(57, 148, 154, 1)");
        Boolean isSelected = selectedStatus(By.xpath("//input[@id='checkBoxOption2']")); //checks option is selected or not
        sa.assertFalse(isSelected);
        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelected = selectedStatus(By.xpath("//input[@id='checkBoxOption2']")); //checks if element is selected or not
        Assert.assertTrue(isSelected, "true");  //assertTrue(condition, expected)
        Boolean isDisplayed = displayStatus(By.xpath("//input[@id='displayed-text']")); //checks if element is displayed or not
        sa.assertTrue(isDisplayed);
        getElement(By.id("hide-textbox")).click();
        isDisplayed = displayStatus(By.xpath("//input[@id='displayed-text']"));  //checks if element is displayed or not
        sa.assertFalse(isDisplayed);
        browser.switchTo().newWindow(WindowType.TAB);
        browser.get("https://www.google.co.uk/");
        Boolean isEnable = displayStatus(By.xpath("//textarea[@id='APjFqb']"));
        sa.assertTrue(isEnable, "true");
        sa.assertAll();

    }
}
