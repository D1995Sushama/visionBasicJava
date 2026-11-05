package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_clear {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(1000);
        WebElement s1=driver.findElement(By.xpath("//input[@class='form-control'][1]"));
        s1.sendKeys("Sushama");
        s1.clear();
        s1.sendKeys("Nandkishor");
    }
}
