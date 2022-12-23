Feature: Menu options
  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button
    And Click the menu option

  Scenario: TC_024-All items option
    Then Click the all items option
    Then User navigated to the "Swag Labs" this page
    And Close the browser

  Scenario: TC_025-About option
    Then Click the about option
    Then User navigated to the "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs" this page
    And Close the browser

  Scenario: TC_026-logout option
    Then Click the logout option
    Then User should in "Swag Labs" this page
    And Close the browser

  Scenario: TC_027-Reset app state option
    Then Click the rest app state option
    Then User should in "Swag Labs" this page
    And Close the browser