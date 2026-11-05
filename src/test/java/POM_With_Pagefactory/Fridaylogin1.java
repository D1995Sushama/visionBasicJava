package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fridaylogin1 {
    @FindBy(xpath = "//input[@id='user-name']")private WebElement un;
    @FindBy(xpath = "//input[@id='password']")private WebElement pwd;
    @FindBy(xpath="//input[@id='login-button']")private WebElement login;
    @FindBy(xpath="//h3[contains(text(),'Username and password do not match')]")private WebElement errormsg;
    public Fridaylogin1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public  void enterun(String unid){
        un.sendKeys(unid);
    }
    public void enterpwd(String password){
        pwd.sendKeys("password");
    }
    public void clicklogin(){
        login.click();
    }
    public String geterrormsg(){
        String actmsg=errormsg.getText();
        return actmsg;
    }
}
