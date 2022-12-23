package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Productspagepo;

public class Sortoptions extends Commonsteps {

    public Productspagepo prod = pagestart();
    @Then("click the a-z option")
    public void click_the_a_z_option() {
        prod.setAzfilter();
    }
    @Then("Check the product sorted in a-z order")
    public void check_the_product_sorted_in_a_z_order() {
        Assert.assertEquals("Sauce Labs Backpack",prod.setproducttext());
    }
    @Then("Click the z-a option")
    public void click_the_z_a_option() {
       prod.setZafilter();
    }
    @Then("Check the product sorted in z-a order")
    public void check_the_product_sorted_in_z_a_order() {
       Assert.assertEquals("Test.allTheThings() T-Shirt (Red)",prod.setproducttext());
    }
    @Then("Click the l-h option")
    public void click_the_l_h_option() {
        prod.setLhfilter();
    }
    @Then("Check the product sorted in l-h option")
    public void check_the_product_sorted_in_l_h_option() {
       Assert.assertEquals("Sauce Labs Onesie",prod.setproducttext());
    }
    @Then("Click the h-l option")
    public void click_the_h_l_option() {
       prod.setHlfilter();
    }
    @Then("Check the product sorted in h-l option")
    public void check_the_product_sorted_in_h_l_option() {
        Assert.assertEquals("Sauce Labs Fleece Jacket",prod.setproducttext());
    }
}
