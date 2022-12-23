Feature: Check the loginfunction

  Scenario: TC_009-To check the login function with both correct credentials
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button
    Then check the page title like "Single Page Apps for GitHub Pages"
    And Close the browser

  Scenario Outline: TC_003-008-To check the Login with different scenarios
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "<username>"
    And Enter the password as "<password>"
    Then Click Login button
    Then Check the Error Shown like "<errormsg>"
    And Close the browser

    Examples: username and passwords
      |username|password|errormsg|
      |standard_user200|secret_sauce|Epic sadface: Username and password do not match any user in this service|
      |standard_user|secret_sauce123|Epic sadface: Username and password do not match any user in this service|
      |standard_user200|secret_sauce123|Epic sadface: Username and password do not match any user in this service|
      |standard_user||Epic sadface: Password is required|
      ||secret_sauce|Epic sadface: Username is required|
      |||Epic sadface: Username is required|

