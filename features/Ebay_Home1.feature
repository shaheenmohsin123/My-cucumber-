Feature: Ebay home scenarios

  @P2 @setCookies
  Scenario: Search items count
    Given I am in Ebay Home Page
    When Search for 'iphone 11'
    Then validate atleast 1000 search items present

  @P3 @setCookies
  Scenario: Search items count
    Given I am in Ebay Home Page
    When Search for 'Toy cars'
    Then validate atleast 100 search items present

  