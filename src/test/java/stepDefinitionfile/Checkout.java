package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Checkoutpo;

public class Checkout extends Commonsteps {

    public Checkoutpo check = checkstart();

    @When("Enter the First name {string}")
    public void enter_the_first_name(String fname) {
        check.setFname(fname);
    }
    @When("Enter the Last name {string}")
    public void enter_the_last_name(String lname) {
        check.setLname(lname);
    }
    @When("Enter the Zipcode {string}")
    public void enter_the_zipcode(String pin) {
        check.setPincode(pin);
    }
    @Then("Click the Continue button")
    public void click_the_continue_button() {
        check.setContinuebutton();
    }
    @Then("Check user navigated to {string} this page")
    public void check_user_navigated_to_this_page(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }
    @When("Enter the First name as {string}")
    public void enter_the_first_name_as(String fname) {
        check.setFname(fname);
    }
    @When("Enter the Last name as {string}")
    public void enter_the_last_name_as(String lname) {
        check.setLname(lname);
    }
    @When("Enter the Zip code as {string}")
    public void enter_the_zip_code_as(String pin) {
        check.setPincode(pin);
    }
    @Then("Check the error is like {string}")
    public void check_the_error_is_like(String error) {
       Assert.assertEquals(error,check.setErrortext());
    }
    @When("Click the cancel button")
    public void click_the_cancel_button() {
        check.setCancel();
    }
    @Then("Check user back to the cart {string} Page")
    public void check_user_back_to_the_cart_page(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }
}
