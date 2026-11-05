package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Today {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement colors= driver.findElement(By.xpath("//select[@id='colors']"));
       Select s1=new Select(colors);
        List<WebElement> options = s1.getOptions();
        System.out.println(s1.getOptions().size());
    }


}
