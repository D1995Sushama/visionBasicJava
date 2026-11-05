package POM_With_Pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkartlogin {
    @FindBy(xpath = "//div[text()='Fashion']") private WebElement fasion;
   @FindBy(xpath = "//div[text()='Jewellery ']") private WebElement jwel;
}
