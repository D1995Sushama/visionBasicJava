package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Friday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors = driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(colors);
        boolean result = s1.isMultiple();
        System.out.println(result);
        if(result){
            System.out.println("multiple select");
        }
        else {
            System.out.println("single");
        }

    }
}
