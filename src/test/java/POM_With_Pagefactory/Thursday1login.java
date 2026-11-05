package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thursday1login {
    @FindBy(xpath = "//input[@placeholder='Username']") private WebElement un;
   @FindBy(xpath = "//input[@placeholder='Password']") private WebElement pwd;
   @FindBy(xpath = "//input[@type='submit']") private WebElement key;
 @FindBy(xpath = "//h3[contains(text(),'Username and password do not match')]") WebElement erroe;
 public Thursday1login(WebDriver driver){
     PageFactory.initElements(driver,this);

 }
 public void enterun(String username){
     un.sendKeys(username);
 }
 public void enterpwd(String password){
     pwd.sendKeys(password);
 }
 public void setkey(){
     key.sendKeys();
 }
 public String errormsg(){
     String acttext = erroe.getText();
     return acttext;
 }
}
