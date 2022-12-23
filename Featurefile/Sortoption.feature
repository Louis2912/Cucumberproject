Feature: Check the Sort option

  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button
    Then Click the sort button

  Scenario: TC_019-Check the a-z option
    And click the a-z option
    Then Check the product sorted in a-z order
    And Close the browser

  Scenario: TC_020-Check the z-a option
    And Click the z-a option
    Then Check the product sorted in z-a order
    And Close the browser

  Scenario: TC_021-Check the l-h option
    Then Click the l-h option
    Then Check the product sorted in l-h option
    And Close the browser

  Scenario: TC_022-Check the h-l option
    Then Click the h-l option
    Then Check the product sorted in h-l option
    And Close the browser