package stepDefinitionfile;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Productspagepo;
import java.util.List;
import java.util.Map;

public class Productpage extends Commonsteps {
    public Productspagepo prod = pagestart();


    @Then("Check the logo present or not")
    public void check_the_logo_present_or_not() {
        Assert.assertEquals(true,prod.setLogo());
    }
    @Then("click the yours cart button")
    public void click_the_yours_cart_button() {
        prod.setYourscartbutton();
    }

    @When("Click the sort button")
    public void click_the_sort_button() {
        prod.setSortoption();
    }
    @Then("sort drop down should work")
    public void sort_drop_down_should_work() {
        Assert.assertEquals(true,prod.setSortoption());
    }

    @When("click the option menu")
    public void click_the_option_menu() throws InterruptedException {
        prod.setMenubutton();
        Thread.sleep(2000);
    }
    @Then("option menu with these options:")
    public void option_menu_with_these_options(io.cucumber.datatable.DataTable dataTable) {
        int a=0;
        int b=0;
        Object listarrey[] = new Object [4];
        List<WebElement> optionname = driver.findElements(By.xpath("//nav/a"));
        for (WebElement menu : optionname)
        {
            listarrey[a]= menu.getText();
            a++;
        }
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String,String> option : data){
            String items = option.get("items");
            Assert.assertEquals(items,listarrey[b]);
            b++;
        }
    }

    @When("check the products name list:")
    public void check_the_products_name_list(io.cucumber.datatable.DataTable dataTable) {
        int a=0;
        int b=0;
        Object productarrey[] = new Object [6];
        List<WebElement> productlist =driver.findElements(By.xpath("//div[@class='inventory_item_label']/a/div"));
        for(WebElement name: productlist)
        {
            productarrey[a]=name.getText();
            a++;
        }
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> names : data)
        {
            String prodlist = names.get("prodlist");
            Assert.assertEquals(prodlist,productarrey[b]);
            b++;
        }
    }

    @When("click the addtocart button")
    public void click_the_addtocart_button() {
        List<WebElement> addbutton = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement clickname : addbutton){
            clickname.click();
        }

    }
    @Then("check all added product name")
    public void check_all_added_product_name() throws InterruptedException {
        int a=0;
        int b=0;
        Object namearrey[] = new Object [6];
        Thread.sleep(3000);
        List<WebElement> prodname = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement names : prodname){
            namearrey[a]= names.getText();
            a++;
        }
        driver.findElement(By.id("shopping_cart_container"));
        List<WebElement> nameoncart = driver.findElements(By.xpath("//div[@class='cart_item_label']/a/div"));
        for (WebElement cartname : nameoncart){
                Assert.assertEquals(cartname.getText(),namearrey[b]);
                b++;
        }
    }

}
