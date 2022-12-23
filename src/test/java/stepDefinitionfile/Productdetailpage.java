package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Productdetailpagepo;

public class Productdetailpage extends Commonsteps {
    public Productdetailpagepo pdetail = productdetailstart();


    @Then("Click the {string} Product")
    public void click_the_product(String product) throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String prodname = name.getText();
        Assert.assertEquals(prodname, product);
        name.click();
        Thread.sleep(2000);
    }
    @Then("Check the Page URl is {string} or not")
    public void check_the_page_u_rl_is_or_not(String url) {
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(url,actualurl);
    }
    @Then("Click the back to Products button")
    public void click_the_back_to_products_button() {
        pdetail.setBacktoprod();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
    }
    @Then("Click the add to cart button")
    public void click_the_add_to_cart_button() {
        pdetail.setAddtocart();
    }
    @Then("Click the Yours cart button")
    public String click_the_yours_cart_button() {
        WebElement name = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']"));
        String detailpagename = name.getText();
        return detailpagename;
    }
    @Then("check the added product showing or not")
    public void check_the_added_product_showing_or_not() {
        prod.setYourscartbutton();
        String url = driver.getCurrentUrl();
        if (url == "https://www.saucedemo.com/cart.html") {
            String cartpagename = driver.findElement(By.id("item_4_title_link")).getText();
            Assert.assertEquals(click_the_yours_cart_button(),cartpagename);
        }

    }

}
