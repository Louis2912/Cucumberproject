package stepDefinitionfile;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Commonsteps {

    protected static WebDriver driver;
    public static Productspagepo prod;
    public static Productdetailpagepo pdetail;
    public static Yourscartpo cart;
    public static Checkoutpo check;
    public Productspagepo pagestart() {
        if (prod == null) {
            prod = new Productspagepo(driver);
        }
        return prod;
    }
    public Productdetailpagepo productdetailstart(){
        if (pdetail== null){
            pdetail = new Productdetailpagepo(driver);
        }
        return pdetail;
    }
    public Yourscartpo cartstart(){
        if (cart== null){
            cart = new Yourscartpo(driver);
        }
        return cart;
    }
    public Checkoutpo checkstart(){
        if (check== null){
            check = new Checkoutpo(driver);
        }
        return check;
    }
}
