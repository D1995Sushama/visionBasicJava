package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultileTextSelectgetGETOPtionsEX_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement color=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s =new Select(color);
        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);
        List<WebElement> alloptions = s.getAllSelectedOptions();
        for(WebElement s1:alloptions){
            System.out.println(s1.getText());
        }
    }
}
