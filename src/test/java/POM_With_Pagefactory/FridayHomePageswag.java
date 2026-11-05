package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FridayHomePageswag {
    @FindBy(xpath = "//div[text()='Swag Labs']")
    private WebElement lgtext;

    public FridayHomePageswag(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String logotxt() {
       String actlogotxt= lgtext.getText();
       return actlogotxt;
    }

}
