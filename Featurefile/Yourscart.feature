Feature: Yours Cart Page
  Background: Common Steps for all
    Given User launch the chromebrowser
    When user opens URL "https://www.saucedemo.com/"
    Then Enter the username as "standard_user"
    And Enter the password as "secret_sauce"
    Then Click Login button

  Scenario: TC_032-User able to change the quantity
    Then Add the product to cart
    Then Click the cart button
    Then Check the quantity field editable
    And Close the browser

  Scenario: TC_033-Continues Shopping button
    Then Add the product to cart
    Then Click the cart button
    Then Click the continue shopping button
    Then Check User back to "https://www.saucedemo.com/inventory.html" this page
    And Close the browser

  Scenario: TC_034-Remove button on cart page
    Then Add the product to cart
    Then Click the cart button
    Then Click remove button
    Then Check the product removed or not
    And Close the browser

  Scenario: TC_035-Checkout button
    Then Add the product to cart
    Then Click the cart button
    Then Click the checkout button
    Then Check user redirect to this "https://www.saucedemo.com/checkout-step-one.html" page
    And Close the browser

  Scenario: TC_036-Checkout without products on cart
    Then Click the cart button
    Then Click the checkout button
    Then Check user stayed in "https://www.saucedemo.com/cart.html" cart page
    And Close the browser

