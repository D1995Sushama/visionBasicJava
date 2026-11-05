package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuesdayAlert{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9607718328");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alt  = driver.switchTo().alert();
        System.out.println(alt.getText());
        Thread.sleep(2000);
        alt.accept();
        System.out.println(alt.getText());
        Thread.sleep(2000);
        alt.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        alt.dismiss();


    }
}
