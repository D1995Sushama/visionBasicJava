package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fridayhhomepage1 {
    @FindBy(xpath = "//div[text()='Swag Labs']")private WebElement logotxt;
    public Fridayhhomepage1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String getlogotxt(){
        String logo=logotxt.getText();
        return logo;
    }

}
