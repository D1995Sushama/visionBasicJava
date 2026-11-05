package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX6_1getAtribute {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nandkishor");
        String text=driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value");
        System.out.println(text);
    }
}
