package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class Ex1_Sendkyes {
   public static void main(String[]args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("https://testautomationpractice.blogspot.com/");
       Thread.sleep(2000);
       WebElement s1=driver.findElement(By.xpath("//input[@id='name']"));
            s1.sendKeys("sushama");
   }
}
