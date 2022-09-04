Feature: Ebay home scenarios
 @P50
  Scenario Outline: Home page links
    Given I am in Ebay Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link          | url                                                            | title         |
      | Motors        | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334 | Motors   |
      | Electronics   | https://www.ebay.com/b/Electronics/bn_7000259124               | Electronics   |
      | Home & Garden | https://www.ebay.com/b/Home-Garden/11700/bn_1853126            | Home & Garden |
