package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowser {
    @Test
    public void workWithBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(500);
        driver.manage().window().maximize(); //for maximizing window
        Thread.sleep(500);
        driver.manage().window().minimize(); //for minimizing window
        Thread.sleep(500);
        driver.manage().window().fullscreen(); //for full screen window
        Thread.sleep(500);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/"); //opens website
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/"); //alternate way to open website
        Thread.sleep(2000);
        driver.navigate().back(); //navigates to previous website
        Thread.sleep(2000);
        driver.navigate().forward(); //navigates to forward
        Thread.sleep(2000);
        driver.navigate().refresh(); //refreshes the website
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB); //open new tab
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.switchTo().newWindow(WindowType.WINDOW); //open new window
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.close(); //closes a specific tab
        Thread.sleep(1000);
        driver.quit(); //closes all window

    }

    @Test
    public void testWindowHandle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[text()='Open Window']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Open Tab']")).click();
        Thread.sleep(2000);
        //unique identification for recent tab -> getWindowHandle()
        System.out.println(driver.getWindowHandle());
        //unique identification for all window and tab -> getWindowHandles()
        System.out.println(driver.getWindowHandles());
        List<String> window_handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle: window_handles){
            System.out.println(handle);
        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("************************************************");
        driver.switchTo().window(window_handles.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("************************************************");
        driver.switchTo().window(window_handles.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("************************************************");
        driver.switchTo().window(window_handles.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("************************************************");

        Thread.sleep(2000);

        driver.quit();
    }


}
