package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thursday1home {
    @FindBy(xpath = "//div[text()='Swag Labs']") private WebElement logo;
    public Thursday1home(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String setlogo(){
        String actlogotext = logo.getText();
        System.out.println(actlogotext);
return actlogotext;
    }
}
