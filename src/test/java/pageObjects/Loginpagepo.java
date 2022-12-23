package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpagepo {

   public WebDriver driver;

    public Loginpagepo(WebDriver newdriver){
       driver = newdriver;
       PageFactory.initElements(newdriver, this);
   }


    @FindBy(how = How.ID, using = "user-name")
    @CacheLookup
        WebElement username;
    @FindBy(how = How.ID,using = "password")
    @CacheLookup
        WebElement password;
    @FindBy(how = How.ID,using = "login-button")
    @CacheLookup
        WebElement loginbutton;
    @FindBy(how = How.XPATH,using = "//h3")
    @CacheLookup
        WebElement errortext;

    public void setUsername(String usname){
        username.sendKeys(usname);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void setLoginbutton(){
        loginbutton.click();
    }
    public String setErrortext(){
//      String error = errortext.getText();
//      return error;
        return errortext.getText();
    }
//    public void setErrortext(WebElement errortext) {
//        this.errortext = errortext;
//    }

}
