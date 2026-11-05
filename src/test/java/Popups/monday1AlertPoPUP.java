package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monday1AlertPoPUP {
    static void main() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String s1=driver.switchTo().alert().getText();
        System.out.println(s1);
        //driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        //driver.switchTo().alert().accept();
    }
}
