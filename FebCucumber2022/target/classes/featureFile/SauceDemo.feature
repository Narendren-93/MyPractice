Feature: Testing Sauce Demo website

Scenario: Test Login Functionality

Given the user launches the url "https://www.saucedemo.com/"
When the user enters the username "standard_user" and password "secret_sauce"
And the user click on the login button
Then Verify url of the webpage is "https://www.saucedemo.com/inventory.html"
#Given the user collects all the items in webpage
When the user finds the highest pricing item
Then the user should validate he product by checking the remove button
#Scenario: Test highest pricing item
#