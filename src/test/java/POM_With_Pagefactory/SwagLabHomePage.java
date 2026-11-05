package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class 2
public class SwagLabHomePage {
    //1: Declaration
    @FindBy(xpath = "//div[text()='Swag Labs']")
    private WebElement logotext;

    //2:initialization
    public SwagLabHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getLogoText(){
        String actlogotext = logotext.getText();
        return actlogotext;
    }

}
