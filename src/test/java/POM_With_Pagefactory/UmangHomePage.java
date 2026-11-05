package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UmangHomePage {
     @FindBy(xpath = "//span[text()='Know Your DigiPin']") private WebElement text;
     public UmangHomePage(WebDriver driver){
         PageFactory.initElements(driver,this);
     }
     public String text1(){
         String acttext=text.getText();
         return acttext;
     }
}

