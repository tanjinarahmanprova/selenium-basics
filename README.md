
# Selenium Basics


## Table of content
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
    - [Java JDK](#java-jdk)
    - [IDE](#ide)
    - [Apache Maven](#apache-maven)
- [Project Installation Steps](#project-installation-steps)
- [Topics](#topics)
    - [Browser Setup](#browser-setup)
    - [Browser Handle](#browser-handle)
    - [Locator](#locator)
    - [Advance Locator](#advance-locator)
    - [Annotation](#annotation)
    - [Interacting with Web Element](#interacting-with-web-element)
    - [Alert](#alert)
    - [Select Class](#select-class)
    - [Action Class](#action-class)
    - [Scroll](#scroll)
    - [iFrame](#iframe)
    - [Assertion](#assertion)
    - [Wait](#wait)
- [Contact](#contact)

## Overview
This repository contains code examples and tutorials for getting started with Selenium WebDriver using Java. Selenium is a powerful tool for automating web browsers, useful for testing web applications and automating repetitive tasks.

## Prerequisites
- [Java JDK](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - [Spring Tools](https://spring.io/tools)
- [Apache Maven](https://maven.apache.org/download.cgi)


## Installation and Setup
### java JDK
- Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) page.
- Run the installer and set up the JDK.
- Set up JAVA_HOME and PATH environment variables:
    - Open System Properties.
    - Navigate to Environment Variables.
    - Add JAVA_HOME with the JDK installation path.
    - Update the PATH variable to include %JAVA_HOME%\bin.
- Verify Java installation by running java --version in a terminal.
### IDE
- Download IntelliJ IDEA community edition from the [official website](https://www.jetbrains.com/idea/download/).
- Run the installer.
- Choose your installation folder and complete the setup.
- Launch IntelliJ IDEA to start using it.
### Apache Maven
- Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
- Extract the zip file to a directory of your choice.
- Set up MAVEN_HOME and PATH environment variables:
    - Open System Properties.
    - Navigate to Environment Variables.
    - Add MAVEN_HOME with the path of Maven directory.
    - Update the PATH variable to include %MAVEN_HOME%\bin.
- Verify Apache Maven installation by running mvn -v in a terminal.

## Project Installation Steps
Follow these steps to set up and start using the framework

- [Fork](https://github.com/tanjinarahmanprova/selenium-basics.git) the repository.
- Clone
```
git clone https://github.com/tanjinarahmanprova/selenium-basics.git
```
- Import the project into your preferred IDE (Eclipse, IntelliJ IDEA or Spring Tools).
- Make any desired changes or additions to the project.

## Topics
### Browser Setup
- [How to open browser](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/BrowserSetup.java)
- [How to quit browser](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/BrowserSetup.java)
- [Helper methods to perform common and repetitive actions on web elements](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/BrowserSetup.java)

### Browser Handle
- [How to maximize window](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to minimize window](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to set window into full-screen](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to open a website](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to navigate to previous and forward](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to refresh window](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to open new tab](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to close current tab](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to get unique identification for recent tab](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)
- [How to get unique identification for all tab and window](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleBrowser.java)

### Locator
- [Locate by ID](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by Class Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by Tag Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by Standard CSS Selector](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by Xpath](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by link text](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)
- [Locate by partial link text](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/Locator.java)

### Advance Locator
- [Locate by CSS Selector using value of ID](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using value of Class](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using value of ID](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using Tag Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath using Tag Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by custom Xpath](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using Parent tag](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath using Parent tag](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using Multiple Attribute](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath using Multiple Attribute](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector using Partial Attribute Value](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath using Partial Attribute Value](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by CSS Selector when there is multiple child tag with same name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath when there is multiple child tag with same name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)
- [Locate by Xpath using Sibling](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/AdvanceLocator.java)

### Annotation
- [@Test](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@BeforeMethod](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@AfterMethod](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@BeforeClass](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@AfterClass](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@BeforeTest ](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@AfterTest ](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@BeforeSuite](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)
- [@AfterSuite](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/TestNGAnnotation.java)

### Interacting with Web Element

- [Click on an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Send Keys to an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Clear an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Get Text of an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Get Attribute value of an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Get CSS Attribute value of an element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Check if element is selected or not](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Check if element is displayed or not](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)
- [Check if element is enable or not](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/InteractingWithWebElements.java)

### Alert
- [Switch to Alter](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAlert.java)
- [Accept Alter](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAlert.java)
- [Cancel Alter](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAlert.java)
- [Write text on Alert prompt](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAlert.java)

### Select Class
- [Select by Visible Text](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleSelectTag.java)
- [Select by Value](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleSelectTag.java)
- [Select by Index](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleSelectTag.java)
- [Select all option](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleSelectTag.java)

### Action Class
- [Scroll to element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)
- [Scroll to amount](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)
- [Hover](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)
- [Arrow down key](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)
- [Arrow up key](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)
- [Copy and paste text](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAction.java)

### Scroll
- [Scroll top to bottom](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleScroll.java)
- [Scroll bottom to top](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleScroll.java)
- [Scroll to element](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleScroll.java)

### iFrame
- [Switch to iFrame by the value of ID](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)
- [Switch to iFrame by the value of Name](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)
- [Switch to iFrame by Locator](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)
- [Switch to iFrame by Index](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)
- [Switch to Parent Frame](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)
- [Switch to default content](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleiFrame.java)

### Assertion
- [Soft Assertion](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAssertion.java)
- [Hard Assertion](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAssertion.java)
- [assertEquals](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAssertion.java)
- [assertTrue](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAssertion.java)
- [assertFalse](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleAssertion.java)

### Wait
- [Explicit wait](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleDiffWait.java)
- [Implicit wait](https://github.com/tanjinarahmanprova/selenium-basics/blob/master/src/test/java/org/example/HandleDiffWait.java)

## Contact
For questions or feedback, please feel free to reach out:
- **GitHub**: [Tanjina Rahman](https://github.com/tanjinarahmanprova)
- **Email**: [rahmantanjina983@gmail.com](mailto:rahmantanjina983@gmail.com)
- **LinkedIn**: [Tanjina Rahman](https://www.linkedin.com/in/tanjina-rahman-a53662191/)


