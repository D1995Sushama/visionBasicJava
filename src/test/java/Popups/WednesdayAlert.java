package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WednesdayAlert {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alt= driver.switchTo().alert();
        String text = alt.getText();
        System.out.println(text);
        alt.accept();
        Thread.sleep(2000);
        String text1 = alt.getText();
        System.out.println(text1);
        alt.accept();

    }
}
