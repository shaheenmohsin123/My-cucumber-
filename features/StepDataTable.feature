Feature: Ebay Advanced Search Page
@P5
Scenario: Advanced search a item
    Given Iam on Ebay Advanced Search Page
    When I Advanced search  an item
      | keyword   | exclude     | min | max |
      | iphone 11 | refurbished | 300 | 900 |
