# Task1
selenium-cucumber-java 
BasicCucumber POM FrameWork

Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)
Eclipse
Eclipse Plugins for Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)

//Folder Structure
POM.xml
To add the all required dependencies(eg.selenium/junit/cucumber) from Mavan Repository


src/test/java/Pages/----> POM Object Repository
1.loginPage.java ---> login page realted elements and Functions
2.fbHomepage.java ---> FB Home page Realted elements and Functions

src/test/java/utility/---> Utility Folder
1.Browserfactory.java ---> To handel the browsers and driversmethods and Url 

src/test/java/Stepdefinitions/ --->
1.LoginSteps.java ---> File for features Step definitions 
2.Testrunner file to Run The feature files and genterate Html Report 


src/test/resources/drivers/ --> add the all requied drivers like Chrome and IE
1.Chromedriver.exe file added

Task1/src/test/resources/features/ --> add all the features
1.fblogin.feature --->this feature file need implement the senarios

target/HtmlReports/ --> To store the Html Reports 
1.report.html ---> open in sys edit options will show the pretty html report


*************************************TASK2******************************************
Need to implement for Task2
1.Properties file to handle the urls and browsers
2.Hooks to handle the parllel exections and add attributes
3.Testdata
4.Try-Catch block implementetaion
