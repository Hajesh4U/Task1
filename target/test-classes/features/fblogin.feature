Feature: To test FB login Functionality and Post Status Message
  
  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "log in or sign up"

  Scenario Outline: Login with correct credentials
    Given user is on login page
    When user enters <user> and <password>
    And click on signin button
    Then user navigated to homepage and title should be "Facebook"
    And post status message "Hello World"
    Then verify the status message

Examples: 
     |user|password|
     |"Testfb4u@gmail.com"|"Test@212"| 