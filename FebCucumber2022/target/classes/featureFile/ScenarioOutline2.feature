Feature: Test Facebook with different logins

Background: 
Given I launch the url "https://www.facebook.com"
#And I click on the login button
#Then I validate the title of new page
Scenario: First set of credentials
#
#Given I launch the url "https://www.facebook.com"
When I enter the username "aaaa@123" and password as "11"
And I click on the login button
Then I validate the title of new page
#
Scenario: Second set of credentials
#
#Given I launch the url "https://www.facebook.com"
When I enter the username "bbb@123" and password as "121212"
And I click on the login button
Then I validate the title of new page
#
Scenario: Third set of credentials
#
#Given I launch the url "https://www.facebook.com"
When I enter the username "ccc@123" and password as "awcacacacaaaaaa"
And I click on the login button
Then I validate the title of new page
#
Scenario: Fourth set of credentials
#
#Given I launch the url "https://www.facebook.com"
When I enter the username "lastusername" and password as "13qww"
And I click on the login button
Then I validate the title of new page







#Scenario: First set of credentials
#
#Given I launch the url "https://www.facebook.com"
#When I enter the username "aaaa@123" and password as "11"
#And I click on the login button
#Then I validate the title of new page
#
#Scenario: Second set of credentials
#
#Given I launch the url "https://www.facebook.com"
#When I enter the username "bbb@123" and password as "121212"
#And I click on the login button
#Then I validate the title of new page
#
#Scenario: Third set of credentials
#
#Given I launch the url "https://www.facebook.com"
#When I enter the username "ccc@123" and password as "awcacacacaaaaaa"
#And I click on the login button
#Then I validate the title of new page
#
#Scenario: Fourth set of credentials
#
#Given I launch the url "https://www.facebook.com"
#When I enter the username "lastusername" and password as "13qww"
#And I click on the login button
#Then I validate the title of new page


#Scenario Outline:  Testing Facebook with different data
#
#Given I launch the url "https://www.facebook.com"
#When I enter the username "<username>" and password as "<password>"
#And I click on the login button
#Then I validate the title of new page
#
#Examples:
#
#|username|password|
#|aaa@123.com|1212|
#|klas|12asc|
#|as|a|
#|naren|3333333|
#|mmmmmmmm|2ss|