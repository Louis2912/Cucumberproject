Feature: Checkout Page
  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button
    Then Add the product to cart
    Then Click the cart button
    Then Click the checkout button

  Scenario: TC_037-Checkout with proper details
    When Enter the First name "Louis"
    When Enter the Last name "Ebi"
    When Enter the Zipcode "600001"
    Then Click the Continue button
    Then Check user navigated to "https://www.saucedemo.com/checkout-step-two.html" this page
    And Close the browser

  Scenario Outline: TC_038-045-Check the page with different inputs
    When Enter the First name as "<fname>"
    When Enter the Last name as "<lname>"
    When Enter the Zip code as "<zcode>"
    Then Click the Continue button
    Then Check the error is like "<error>"
    And Close the browser

    Examples: Firstname, Lastname, Zipcode and errors are
    |fname|lname|zcode|error|
    ||Ebi|600001|Error: First Name is required|
    |Louis||600001|Error: Last Name is required|
    |Louis|Ebi||Error: Postal Code is required|
    ||||Error: First Name is required|
    |Louis123|Ebi|600001|First Name should not contains number|
    |Louis|Ebi123|600001|Last Name should not contains number|
    |Louis|Ebi|chennai|Zipcode should not contains Alphabets|
    |Louis|Ebi|60000001|Zipcode should not more than 6 characters|

  Scenario: TC_046-Check Back button
    When Click the cancel button
    Then Check user back to the cart "https://www.saucedemo.com/cart.html" Page
    And Close the browser

