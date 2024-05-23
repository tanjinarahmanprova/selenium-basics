package org.example;

import org.testng.annotations.*;

public class TestNGAnnotation {
    @Test(priority = 1 )
    public void testCase2() {
        System.out.println("This is the A Normal Test Case 2");
    }
    @Test(priority = 0)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case 1");
    }
    @BeforeMethod //Runs before each test method
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod  //Runs after each test method
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass  //Runs before the first test method in the current class is invoked
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass  //Runs after all the test methods in the current class have been invoked
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest  //Runs before any test method belonging to the classes
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest  //Runs after all the test methods belonging to the classes
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite  //Runs once before all tests in the suite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite  //Runs once after all tests in the suite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }
}
