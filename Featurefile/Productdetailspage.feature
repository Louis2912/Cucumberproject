Feature: Check the product detail page

  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button
    Then Click the "Sauce Labs Backpack" Product

  Scenario: TC_016-Check the product detail page showing or not
    Then Check the Page URl is "https://www.saucedemo.com/inventory-item.html?id=4" or not
    And Close the browser

  Scenario: TC_017-Check the Back to Products button
    Then Click the back to Products button
    And  Close the browser

  Scenario: TC_018-Check the Add to cart button
    Then Click the add to cart button
    Then Click the Yours cart button
    Then check the added product showing or not
    And Close the browser