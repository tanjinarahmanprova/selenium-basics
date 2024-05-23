package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlert extends BrowserSetup{
    @Test
    public void testAlert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        Thread.sleep(1000);
        Alert alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.accept(); //accept alert
        String result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
        System.out.println("***************************************************************************");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        Thread.sleep(1000);
        alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.accept(); //accept alert
        result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
        System.out.println("***************************************************************************");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        Thread.sleep(1000);
        alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.dismiss(); //cancel alert
        result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
        System.out.println("***************************************************************************");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        Thread.sleep(1000);
        alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.dismiss(); //cancel alert
        result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
        System.out.println("***************************************************************************");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        Thread.sleep(1000);
        alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.accept(); //accept alert
        result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
        System.out.println("***************************************************************************");
        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        Thread.sleep(1000);
        alert = browser.switchTo().alert(); //browser switch to alter
        System.out.println(alert.getText()); //prints alert message
        alert.sendKeys("Hello");  //write text on alert prompt
        alert.accept(); //accept alert
        result = getText(By.xpath("//p[@id='result']"));
        System.out.println(result);
        Thread.sleep(1000);
    }
}
