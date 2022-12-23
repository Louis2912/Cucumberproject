package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpo {
    public WebDriver driver;
    public Checkoutpo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver,this);
    }
    @FindBy(how = How.ID, using = "first-name")
    @CacheLookup
    WebElement fname;
    @FindBy(how = How.ID, using = "last-name")
    @CacheLookup
    WebElement lname;
    @FindBy(how = How.ID, using = "postal-code")
    @CacheLookup
    WebElement pincode;
    @FindBy(how = How.ID, using = "continue")
    @CacheLookup
    WebElement continuebutton;
    @FindBy(how = How.ID, using = "cancel")
    @CacheLookup
    WebElement cancel;
    @FindBy(how = How.XPATH, using = "//h3")
    @CacheLookup
    WebElement errortext;

    public void setFname(String firstname){
        fname.sendKeys(firstname);
    }
    public void setLname(String lastname){
        lname.sendKeys(lastname);
    }
    public void setPincode(String zipcode){
        pincode.sendKeys(zipcode);
    }
    public void setContinuebutton(){
        continuebutton.click();
    }
    public void setCancel(){
        cancel.click();
    }
    public String setErrortext(){
//        String error = errortext.getText();
//        return error;
        return errortext.getText();
    }
//    public void setErrortext(WebElement errortext){
//        this.errortext = errortext;
//    }
}
