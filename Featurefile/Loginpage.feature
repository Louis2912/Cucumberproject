Feature: Loginpage
  Background: Common steps
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"

  Scenario: TC_001-Check the Login page
    And check the login page shown or not
    Then Close the browser

  Scenario: TC_002-Check the Logo on Loginpage
    And Check the logo present on the centre of the login page
    Then Close the browser