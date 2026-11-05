package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UmangLoginpage {

    @FindBy(xpath = "//input[@formcontrolname='mob']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement password;
    @FindBy(xpath = "//button[text()=' Login '] ")
    private WebElement login;
    @FindBy(xpath = "//div[text()='Please provide a valid MPIN to proceed']")
    private WebElement errormsg;
    public UmangLoginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void userid(String UI){
        username.sendKeys(UI);
    }
    public void pass(String PW){
        password.sendKeys(PW);
    }
    public void log(){
        login.click();
    }
    public String error(){
        String acttext=errormsg.getText();
        return acttext;
    }
}




