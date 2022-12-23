package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Productspagepo;

import java.util.Set;

public class Socialmediaconnect extends Commonsteps {
   public Productspagepo prod = pagestart();

   @Then("User redirected to {string} this page")
   public void user_redirected_to_this_page(String title) throws InterruptedException {
      String homehandle = "CDwindow-1D0F6325668309EAD7D91F65CE05122F";
      Set<String> handles = driver.getWindowHandles();
      Thread.sleep(2000);
      for (String handle : handles) {
         if (!handle.equalsIgnoreCase(homehandle)) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains(title)) {
               Assert.assertTrue(true);
            } else {
               Assert.assertTrue(false);
            }
         }
      }
   }
   @Then("Click the fackbook icon")
   public void click_the_fackbook_icon() {
      prod.setFacebook();
   }

   @Then("click the twitter icon")
   public void click_the_twitter_icon() {
      prod.setTwitter();
   }

   @Then("Click the linkdin icon")
   public void click_the_linkdin_icon() {
      prod.setLinkdin();
   }


}
