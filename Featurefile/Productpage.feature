Feature: Check the Product page

  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button

  Scenario: TC_010-To check the logo
    Then Check the logo present or not
    And Close the browser

  Scenario: TC_011-To check the yours cart button
    Then click the yours cart button
    Then check the page title like "Single Page Apps for GitHub Pages"
    And Close the browser

  Scenario: TC_012-Check the sort option working or not
    When Click the sort button
    Then sort drop down should work
    And Close the browser

  Scenario: TC_013-To check option menu
    When click the option menu
    Then option menu with these options:
    |items|
    |ALL ITEMS|
    |ABOUT|
    |LOGOUT|
    |RESET APP STATE|
    And Close the browser

  Scenario: TC_014-To check all products
    When  check the products name list:
    |prodlist|
    |Sauce Labs Backpack|
    |Sauce Labs Bike Light|
    |Sauce Labs Bolt T-Shirt|
    |Sauce Labs Fleece Jacket|
    |Sauce Labs Onesie|
    |Test.allTheThings() T-Shirt (Red)|
    And Close the browser

  Scenario: TC_015-To check addtocart button
    When click the addtocart button
    Then click the yours cart button
    Then check all added product name
    And Close the browser



