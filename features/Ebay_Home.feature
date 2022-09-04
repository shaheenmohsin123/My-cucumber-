Feature: Ebay Home Page Scenarios
@P1 @setCookies @Test
Scenario: Advanced Search Link
Given I am on Ebay Home Page
When I click on Advanced Link
Then I navigate to Advanced Search page
@PT
Scenario: sell link
Given I am on Ebay Home Page
When I click sell Link
Then I navigate to the sell page