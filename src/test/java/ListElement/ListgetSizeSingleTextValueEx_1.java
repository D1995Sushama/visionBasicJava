package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListgetSizeSingleTextValueEx_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s=new Select(colors);
        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);
        System.out.println(s.getAllSelectedOptions().size());


    }
}
