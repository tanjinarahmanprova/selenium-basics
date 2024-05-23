package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends BrowserSetup{
    @Test
    public void testSelectedOption() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(3000);

        Select select = new Select(getElement(By.id("dropdown-class-example"))); //create an object for Select class

        select.selectByVisibleText("Option2");  //select by visible text
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);
        select.selectByValue("option1");  //select by value
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getTagName());
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);
        select.selectByIndex(3);  //select by index
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getCssValue("font-size"));

        List<WebElement> options = select.getOptions();  //select all options
        for (WebElement o: options){
            System.out.println(o.getText());
        }
    }

}
