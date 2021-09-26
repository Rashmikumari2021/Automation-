Feature: Checkout process
 
 
   Scenario: To checkout a product from search result
     
    Given User is authenticated and have product list in search list
    Then I should able to add the item in cart and navigate successfully till payment page
    Then Validate product details in payment page

    
   