package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Productspagepo {

    public WebDriver driver;
    public Productspagepo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver,this);
    }
    @FindBy(how = How.XPATH,using = "//div[@class='app_logo']")
    @CacheLookup
    WebElement logo;
    @FindBy(how = How.ID,using = "shopping_cart_container")
    @CacheLookup
    WebElement yourscartbutton;
    @FindBy(how = How.ID,using = "add-to-cart-sauce-labs-backpack")
    @CacheLookup
    WebElement addtocartfirstprod;
    @FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
    @CacheLookup
    WebElement sortoption;
    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    @CacheLookup
    WebElement menubutton;
    @FindBy(how = How.XPATH, using = "(//div[@class='inventory_item_label']/a/div)[1]")
    @CacheLookup
    WebElement producttext;
    @FindBy(how = How.XPATH, using = "//option[@value='az']")
    @CacheLookup
    WebElement azfilter;
    @FindBy(how = How.XPATH, using = "//option[@value='za']")
    @CacheLookup
    WebElement zafilter;
    @FindBy(how = How.XPATH, using = "//option[@value='lohi']")
    @CacheLookup
    WebElement lhfilter;
    @FindBy(how = How.XPATH, using = "//option[@value='hilo']")
    @CacheLookup
    WebElement hlfilter;
    @FindBy(how = How.ID, using = "inventory_sidebar_link")
    @CacheLookup
    WebElement allitems;
    @FindBy(how = How.ID, using = "about_sidebar_link")
    @CacheLookup
    WebElement about;
    @FindBy(how = How.ID, using = "logout_sidebar_link")
    @CacheLookup
    WebElement logout;
    @FindBy(how = How.ID, using = "reset_sidebar_link")
    @CacheLookup
    WebElement reset;
    @FindBy(how = How.XPATH, using = "//a[text()='Twitter']")
    @CacheLookup
    WebElement twitter;
    @FindBy(how = How.XPATH, using = "//a[text()='Facebook']")
    @CacheLookup
    WebElement facebook;
    @FindBy(how = How.XPATH, using = "//a[text()='LinkedIn']")
    @CacheLookup
    WebElement linkdin;
    @FindBy(how = How.XPATH,using = "//div[text()='Sauce Labs Backpack']")
    @CacheLookup
    WebElement productname;
    public void setYourscartbutton(){
        yourscartbutton.click();
    }
    public void setAddtocartfirstprod(){
        addtocartfirstprod.click();
    }
    public boolean setSortoption(){
        sortoption.click();
        return sortoption.isDisplayed();
    }
    public void setMenubutton(){
        menubutton.click();
    }
    public void setAzfilter(){
        azfilter.click();
    }
    public void setZafilter(){
        zafilter.click();
    }
    public void setLhfilter(){
        lhfilter.click();
    }
    public void setHlfilter(){
        hlfilter.click();
    }
    public void setAllitems(){
        allitems.click();
    }
    public void setAbout(){
        about.click();
    }
    public void setLogout(){
        logout.click();
    }
    public void setReset(){
        reset.click();
    }
    public void setTwitter(){
        twitter.click();
    }
    public void setFacebook(){facebook.click();}
    public void setLinkdin(){
        linkdin.click();
    }
    public void setProductname(){
        productname.click();
    }
    public String setproducttext(){
       return producttext.getText();
    }
    public boolean setLogo(){
       return logo.isDisplayed();
    }
}
