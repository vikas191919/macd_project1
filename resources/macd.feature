@test
Feature: user should add an item to cart


#the user can be able to successfully login by using the following credentials that are present in the examples section
@login
Scenario Outline: The user should be able to successfully login into the website
Given User is on home page and click on login/signup
When User clicks on the Login Via Password option
When User enters mobile number as "<mobile number>" and password as "<Password>"
Then login should be successful
Examples: - 
|mobile number|Password |
|9908409453|vikas1235|

#the user cannot login into the website by wrong credentials and the error message is displayed
@invalidlogin
Scenario:  User should not be able to login into the website
Given User is in the home page
When User clicks on the Login Via Password option
#When User enters mobile number and password
Then the error message "Invalid username or password" should be displayed

#the user should be able to select the location by using the following address from the examples and the resturants in the location are displayed
@location
Scenario Outline: user should search and select a location 
Given user click on location label  and enters a "<address>"
When the user selects first location displayed and enters address and address type
Then the location should be selected 
Examples: -
|address|
|visakhapatnam|

#when the user gives an location where mcdonalds is not serving it shows an error message
@invalidlocation
Scenario Outline: user should search and select a location 
Given user is on the homepage and click on location
When user click on search bar and enters a "<location1>"
When the user selects first displayed location and click on done
Then an error message should be displayed "We do not serve this location as of now."
Examples: - 
|location1|
| Markapur |

#the user can search for items with keywords and the results matching with the keywords are displayed
@search
Scenario: user should search for an item in the search bar
Given user is on home page and search for chicken burger
When the results are displayed add the first item to the cart that is displayed
Then user cart should display the selected item

# if the user search for error keywords in the search box an error message is displayed
@invalidsearch
Scenario: user search for an invalid item in the search bar
Given the user is on the home page
When user search for an invalid item in search box 
Then the system should display an error message "No results found. Check your spelling or try something different."

#the calories of items are displayed when the user clicks on the calories button
@calories
Scenario: user should be able to see the calories in the items 
Given user is on the home page
When the user search for an item the results are displayed
When the user click on the calories button
Then the calories in the each item should be displayed

#when this is selectd only the veg items are displayed
@veg
Scenario: the user should be able to see only veg items
Given the user is on the home page
When the user click on the veg only button
Then only the veg items should be displayed

#when the user want to download mcdonalds app for android, the user has to click on the playstore icon
@playstore
Scenario: user should be able to download McDelivery android app
Given user is on the homepage
When the user click on the Google Play icon
Then the user should be redirected to the playstore

#when the user want to download mcdonalds app for ios, the user has to click on the appstore icon
@appstore
Scenario: user should be able to download McDelivery ios app
Given user is on the homepage
When the user click on the App store icon
Then the user should be redirected to the App store

#after selecting and adding the item the user can be able to add customizations to the item selected
@customizations
Scenario: User should be able to add customizations to the selected item
Given the is on home page
When the user search and select the first item displayed 
When the user add the customizations required and clicks on add to cart  
Then the item should be displayed in the cart along with the customizations selected

#the items selcted by the user along with the customizations made are displayed in the cart 
@cart
Scenario: user is viewing the selected items in the cart
Given the user is on the home page
When the user selects a item and the user click on the cart
Then the selected items should be displayed

#it removes all the items present in the cart
@Removefromcart
Scenario: Remove all selected items from cart
Given user has selected an item
When user adds the item to cart and click on clear all from cart
Then all the items in the cart should be removed

