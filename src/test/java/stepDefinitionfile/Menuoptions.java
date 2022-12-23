package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Productspagepo;

public class Menuoptions extends Commonsteps {

    public Productspagepo prod = pagestart();

    @Then("Click the menu option")
    public void click_the_menu_option() throws InterruptedException {
        prod.setMenubutton();
        Thread.sleep(2000);
    }
    @Then("Click the all items option")
    public void click_the_all_items_option() {
       prod.setAllitems();
    }
    @Then("User navigated to the {string} this page")
    public void user_navigated_to_the_this_page(String title) {
        Assert.assertEquals(title,driver.getTitle());
    }
    @Then("Click the about option")
    public void click_the_about_option() {
        prod.setAbout();
    }
    @Then("Click the logout option")
    public void click_the_logout_option() {
       prod.setLogout();
    }
    @Then("User should in {string} this page")
    public void user_should_in_this_page(String title) {
       Assert.assertEquals(title,driver.getTitle());
    }
    @Then("Click the rest app state option")
    public void click_the_rest_app_state_option() {
        prod.setReset();
    }

}
