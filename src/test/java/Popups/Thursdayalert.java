package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Thursdayalert {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alt= driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
        Thread.sleep(2000);
        Alert alt2 = driver.switchTo().alert();
        System.out.println(alt2.getText());
        alt2.dismiss();
        driver.quit();





    }
}
