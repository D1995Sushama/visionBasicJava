package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookWithoutPOM {
   @FindBy(xpath = "//input[@name='email']")
   private WebElement UN;
   @FindBy(xpath = "//input[@type='password']") private WebElement PWD;
   @FindBy(xpath = "//div[@aria-label='Log in']") private WebElement lg;
   @FindBy(xpath = "(//div[@role='presentation'])[4]") private WebElement robo;
    @FindBy(xpath = "//button[text()='Start']") private WebElement robo1;
   @FindBy(xpath = "//span[contains(@class,'x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs xt0psk')]") private WebElement error;
   public FacebookWithoutPOM(WebDriver driver){

       PageFactory.initElements(driver,this);
   }
   public void Userid(String ID){

       UN.sendKeys(ID);
   }
   public void Passwd(String PD){

       PWD.sendKeys(PD);
   }
   public void login(){

       lg.click();
   }
   public void ckrobo(){
       robo.click();
   }
    public void ckr(){
        robo1.click();
    }

   public String errormsg(){
       String actmsg=error.getText();
       return actmsg;
   }

}
