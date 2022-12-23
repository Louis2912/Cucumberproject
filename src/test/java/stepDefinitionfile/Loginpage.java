package stepDefinitionfile;

import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;


public class Loginpage extends Commonsteps {
    public Loginpagepo login;


    @Given("User launch the chromebrowser")
    public void user_launch_the_chromebrowser() {
        driver = new ChromeDriver();
        login = new Loginpagepo(driver);
        prod = new Productspagepo(driver);
        pdetail = new Productdetailpagepo(driver);
        cart = new Yourscartpo(driver);
        check = new Checkoutpo(driver);
        driver.manage().window().maximize();

    }

    @When("user opens URL {string}")
    public void user_opens_url(String link) {
        driver.get(link);
        System.out.println("Handleeee is " +driver.getWindowHandle());

    }

    @When("check the login page shown or not")
    public void check_the_login_page_shown_or_not() {
        Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());

    }
    @After
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();

    }

    //TC_002

    @When("Check the logo present on the centre of the login page")
    public void check_the_logo_present_on_the_centre_of_the_login_page() {
        Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed());
    }

    //TC_003 Login Functions

    @Then("Enter the username as {string}")
    public void enter_the_username_as(String usname) {
        login.setUsername(usname);
    }

    @Then("Enter the password as {string}")
    public void enter_the_password_as(String password) {
        login.setPassword(password);
    }

    @Then("Click Login button")
    public void click_login_button() {
        login.setLoginbutton();
    }

    @Then("check the page title like {string}")
    public void check_the_page_title_like(String title) {
        Assert.assertEquals(title, "Single Page Apps for GitHub Pages");
    }

    @Then("Check the Error Shown like {string}")
    public void check_the_error_shown_like(String errormsg) {
        Assert.assertEquals(login.setErrortext(), errormsg);
    }

}


