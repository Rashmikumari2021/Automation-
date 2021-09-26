# Automation-CucumberDemo Project:
The project for test automation, covering UI acceptance using the BDD Framework. 

Concepts Included-
Shared state across cucumber step definitions
Dependency injection
Page Object Model
Page Factory
Common web page interaction methods
Commonly used test utility classes

Tools-
Maven
Cucumber-JVM
JUnit
Selenium Webdriver

Requirements-
In order to utilise this project you need to have the following installed locally:

Maven 3
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 1.8

Usage-
The project is broken into separate feature files with their coressponding step definitions 
a.Page1_Login
b.page2_ProductSearch
c.Page3_Checkout

To run end to end scenario right click on Testrunner.java and Run As a Junit Test.

Reporting-
Reports are written into their respective /target directories after a successful run.
Reports are generated in the form of HTMLReports and JUnit Reports with files as index.html and report.xml.
User is able to open the report as per his choice of editor either on web browser ,xml editor.
