package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Click {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement s1=driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]"));
       s1.click();
       WebElement s2=driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]"));
       s2.click();

    }
}
