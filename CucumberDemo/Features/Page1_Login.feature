Feature: Register & Login 
 
 
   Scenario: Verify Registration Functionality
     
    Given User is on Homepage of Application
    When I Click on Sign in 
    And I fill the email id for register user and click create account button
    Then It should ask me for more details for registration and click save button
    And I should see firstname and lastname as username after account creation
    Then I should able to logout
    
    Scenario: Verify Login Functionality
     
   
    Given User is on home page,user fill the email id and password for login and click login button
    Then I should see firstname and lastname as username after login
     
   