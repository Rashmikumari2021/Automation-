Feature: Product Search
 
 
   Scenario: Product Search in my search page
     
    Given User authenticated and is on Homepage of Application
    Then I should able to enter search text in search box 
    When I click on Search buttom 
    Then I should able to see list of products for my search
 
    
   