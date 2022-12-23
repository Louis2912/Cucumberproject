package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Yourscartpo;

public class Yourscart extends Commonsteps {
    public Yourscartpo cart = cartstart();
    @Then("Add the product to cart")
    public void add_the_product_to_cart() {
        prod.setAddtocartfirstprod();
    }
    @Then("Click the cart button")
    public void click_the_cart_button() throws InterruptedException {
        prod.setYourscartbutton();
        Thread.sleep(2000);
    }
    @Then("Check the quantity field editable")
    public void check_the_quantity_field_editable() {
        Assert.assertTrue(cart.setQuantity());
    }
    @Then("Click the continue shopping button")
    public void click_the_continue_shopping_button() throws InterruptedException {
        cart.setContinueshopping();
        Thread.sleep(2000);
    }
    @Then("Check User back to {string} this page")
    public void check_user_back_to_this_page(String url) {
        String pageurl = driver.getCurrentUrl();
        Assert.assertEquals(url,pageurl);
    }
    @Then("Click remove button")
    public void click_remove_button() throws InterruptedException {
        cart.setRemoveprod();
        Thread.sleep(2000);
    }
    @Then("Check the product removed or not")
    public void check_the_product_removed_or_not() {
        try {
            cart.setProdnameoncart();
        }catch (Exception error) {
            error.getCause();
            Assert.assertNull(error.getCause());																//catch the null exception and validate
        }
    }
    @Then("Click the checkout button")
    public void click_the_checkout_button() throws InterruptedException {
        cart.setCheckoutbutton();
        Thread.sleep(2000);
    }
    @Then("Check user redirect to this {string} page")
    public void check_user_redirect_to_this_page(String url) {
        String pageurl = driver.getCurrentUrl();
        Assert.assertEquals(url,pageurl);
    }
    @Then("Check user stayed in {string} cart page")
    public void check_user_stayed_in_cart_page(String url) {
        String pageurl = driver.getCurrentUrl();
        Assert.assertEquals(url,pageurl);
    }
}
