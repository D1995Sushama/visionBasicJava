package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thursdaylogin {
     @FindBy(xpath = "//input[@placeholder='Username']") private WebElement un;
   @FindBy(xpath = "//input[@placeholder='Password']") private WebElement PWD;
   @FindBy(xpath = "//input[@type='submit']") private WebElement logkey;
    @FindBy(xpath = "//h3[contains(text(),'Username and password do not match any user')]") private WebElement erroemsg;
     public Thursdaylogin(WebDriver driver){
         PageFactory.initElements(driver,this);
     }
     public void enterun(String UNvalue){
         un.sendKeys(UNvalue);
     }
     public void enterPWD(String PWDvalue){
         PWD.sendKeys(PWDvalue);
     }
     public void enterkey(){
         logkey.click();
     }
     public String geterror(){
         String acterrormsg = erroemsg.getText();
         return acterrormsg;
     }
}
