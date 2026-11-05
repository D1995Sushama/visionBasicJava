package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_getAtribute {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
       String text= driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).getAttribute("placeholder");
       System.out.println(text);
    }
}
