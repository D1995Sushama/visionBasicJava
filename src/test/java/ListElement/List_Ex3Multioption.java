package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Ex3Multioption {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
         WebElement colour=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s1=new Select(colour);
        s1.selectByValue("red");
        s1.selectByVisibleText("Yellow");
        s1.selectByIndex(0);
    }
}
