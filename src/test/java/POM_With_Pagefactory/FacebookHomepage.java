package POM_With_Pagefactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class FacebookHomepage {
   @FindBy(xpath = "//img[@class='wbloks_1']")
   private WebElement img;
   public FacebookHomepage(WebDriver driver){
       PageFactory.initElements(driver,this);
   }
   public void image() throws IOException {
       File scr = img.getScreenshotAs(OutputType.FILE);
       File dest=new File("C:\\Users\\USER\\Documents\\sush\\image\\FCDP.png");
       FileHandler.copy(scr,dest);

   }
}
