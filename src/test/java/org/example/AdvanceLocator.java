package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AdvanceLocator extends BrowserSetup {
    @Test //This annotation marks a method as a test method
    public void testPageLocator() throws InterruptedException {
        //open webpage in browser
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        // #value_of_id indicates CSS Selector
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(1000);
        // .value_of_className indicates CSS Selector
        browser.findElement(By.cssSelector(".radioButton")).click();
        Thread.sleep(1000);
        // tag name as it is also indicated CSS Selector
        String h1_text_CSS = browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("GET BY CSS SELECTOR: "+h1_text_CSS );
        //XPATH with tag name -> //tag_name
        String h1_text_XPATH = browser.findElement(By.xpath("//h1") ).getText();
        System.out.println("GET BY XPATH: "+h1_text_XPATH );
        //Custom XPATH -> //*[@attribute='value of attribute']
        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(1000);
        //CSS Selector with parent tag; expression -> parent_tag[attribute = 'value of attribute'] > child_tag
        String text = browser.findElement(By.cssSelector("div[id='checkbox-example'] > fieldset > legend")).getText();
        System.out.println("CSS SELECTOR: "+text);
        //XPATH with parent tag; expression -> //parent_tag[@attribute = 'value of attribute'] / child_tag
        text = browser.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend")).getText();
        System.out.println("XPATH: "+text);
        //CSS Selector with multiple attribute -> tag_name[attribute1='value'][attribute2='value']
        browser.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
        Thread.sleep(1000);
        //XPATH with multiple attribute -> //tag_name[@attribute1='value'][@attribute2='value']
        browser.findElement(By.xpath("//input[@name='radioButton'][@value='radio2']")).click();
        Thread.sleep(2000);
        //CSS Selector with partial attribute value(first part) -> tag[attribute ^= 'partial value'], used when a part of attribute value changes dynamically
        browser.findElement(By.cssSelector("input[placeholder ^='Enter Your']")).sendKeys("Tanjina ");
        Thread.sleep(2000);
        //XPATH with partial attribute value(first part) -> //tag[starts-with(@placeholder,'Enter Your')], used when a part of attribute value changes dynamically
        browser.findElement(By.xpath("//input[starts-with(@placeholder,'Enter Your')]")).sendKeys("Rahman ");
        Thread.sleep(2000);
        //CSS Selector with partial attribute value(any part) -> tag[attribute *= 'partial value'], used when a part of attribute value changes dynamically
        browser.findElement(By.cssSelector("input[placeholder *='Your']")).sendKeys("Tanjina ");
        Thread.sleep(2000);
        //XPATH with partial attribute value(any part) -> //tag[contains(@placeholder,'Enter Your')], used when a part of attribute value changes dynamically
        browser.findElement(By.xpath("//input[contains(@placeholder,'Your')]")).sendKeys("Rahman ");
        Thread.sleep(2000);
        //CSS Selector when there is multiple child tag with same name;
            //Expression -> parent_tag[attribute='value'] > child_tag > child_tag:nth-child[number_of_child_tag]
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody > tr > th:nth-child(1)")).getText();
        System.out.println(text);
        //Xpath when there is multiple child tag with same name; / -> direct child, // -> any child, last() -> if number of last child_tag is unknown
            //Expression -> //parent_tag[@attribute='value'] //child_tag /child_tag[number_of_child_tag]
        text = browser.findElement(By.xpath("//table[@name='courses'] //tr /th[2]")).getText();
        System.out.println(text);
        //XPATH with siblings
            //preceding sibling -> //tag[text()='text between tag']/preceding-sibling::th ->for immediate preceding
            //following sibling -> //tag[text()='text between tag']/following-sibling::th ->for immediate following
        text = browser.findElement(By.xpath("//th[contains(text(),'Cour')]/preceding-sibling::th")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//th[contains(text(),'Inst')]/following-sibling::th[last()]")).getText();
        System.out.println(text);
        //For multiple web element use findElements
        List<WebElement> tableData = browser.findElements(By.xpath("//table[@name='courses']//td"));
        System.out.println(tableData.size());
        for (WebElement e: tableData){
            System.out.println(e.getText());
        }


    }
}
