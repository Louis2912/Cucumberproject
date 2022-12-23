Feature: Social media Connect

  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button

  Scenario: TC_030-Check the facebook connect
    Then Click the fackbook icon
    Then User redirected to "https://www.facebook.com/saucelabs" this page
    And Close the browser

  Scenario: TC_029-Check the twitter connect
    Then click the twitter icon
    Then User redirected to "https://twitter.com/saucelabs" this page
    And Close the browser

  Scenario: TC_31-Check the linkdin connect
    Then Click the linkdin icon
    Then User redirected to "linkedin.com" this page
    And Close the browser