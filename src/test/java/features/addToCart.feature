Feature: Costco user sign in Feaures
@test11
 Scenario: Given user in the Homepage of Costco
	  When user click on register button
	  And user will input userId 'shailakhnaum7@gmail.com'
	  And user will input in password 'Tasfia4922!'
	  And user click on signIn button

@bdd-data-driven
  Scenario Outline:Items added to cart testing
    Given user is in the homepage
   	When user clicks on searchField
    And user type 'Body Lotion'
 
    Then user will see the list of products
    When user click the second item
    And user will select the 2nd item
    And user will click addToCart
    And user will click viewCart
    Then cart will show item added
    
    

    
	  
  