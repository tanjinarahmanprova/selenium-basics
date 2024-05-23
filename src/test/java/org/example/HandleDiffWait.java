package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDiffWait extends BrowserSetup{
    @Test
    public void testWait(){
        browser.get("https://qavbox.github.io/demo/alerts/");
        clickOnElement(By.id("delayalert"));
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10)); //create object for WebDriverWait(explicit)
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());  //to wait until the alert is present(explicit)
        //Alert alert = browser.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
        alert.accept();

       browser.get("https://qavbox.github.io/demo/delay/");
        clickOnElement(By.xpath("//input[@name='commit1']"));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='delay']"))); //explicit wait
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
        Assert.assertTrue(displayStatus(By.xpath("//h2[@id='delay']")));
    }
}
