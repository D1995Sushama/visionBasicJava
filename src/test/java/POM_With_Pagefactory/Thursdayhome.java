package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thursdayhome {
    @FindBy(xpath = "//div[text()='Swag Labs']")
    private WebElement logo;
     public Thursdayhome(WebDriver driver){
         PageFactory.initElements(driver,this);
     }
     public String veryfylogo(){
         String logtx = logo.getText();
         return logtx;
     }
}
