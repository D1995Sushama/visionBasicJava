package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Sunday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(country);
        List<WebElement> s1 = s.getOptions();
        for(WebElement s2:s1){
            System.out.println(s2.getText());

        }
        System.out.println(s.getOptions().size());

        
    }
}
