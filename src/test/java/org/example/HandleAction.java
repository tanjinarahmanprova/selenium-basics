package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleAction extends BrowserSetup{
    @Test
    public void testAction() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement hoverElement = getElement(By.id("mousehover"));
        Actions action = new Actions(browser);
        action.scrollToElement(hoverElement).build().perform(); //scroll to the element
        action.scrollByAmount(0,100).build().perform();  //scroll down by amount
        action.clickAndHold(hoverElement).build().perform(); //Hover
        Thread.sleep(1000);
        clickOnElement(By.xpath("//a[normalize-space()='Top']")); //click on the element
        Thread.sleep(1000);

        clickOnElement(By.id("dropdown-class-example"));
        action.sendKeys(Keys.ARROW_DOWN).build().perform();  //arrow down key on the keyboard
        Thread.sleep(1000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ARROW_UP).build().perform();  //arrow up key on the keyboard
        Thread.sleep(1000);

        //Copy paste
        action.sendKeys(getElement(By.id("autocomplete")),"Tanjina").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();  //select text
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();  //copy text
        getElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL,"v");
        Thread.sleep(1000);
    }
}
