package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class 1
public class SwagLabLoginPage {
    //    1. Data member/Variable should be declared globally with access level private using @findBy Annotation
   @FindBy(xpath = "//input[@id='user-name']") private  WebElement UI;
   @FindBy(xpath = "//input[@id='password']") private WebElement PW;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement Login;
    @FindBy(xpath = "//h3[contains(text(),'Username and password do not match')]") private WebElement errormsg;
   //2: Initialize within a constructor with access level public using pagefactory class
    public SwagLabLoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void UserName(String UNvalue){

        UI.sendKeys(UNvalue);
    }
    public void Password(String PWvalue){

        PW.sendKeys(PWvalue);
    }
    public void login(){

        Login.click();
    }
    public String errorMsg(){
        String acttext = errormsg.getText();
        return acttext;
    }

}

