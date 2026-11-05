package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex1_ImplicitWait {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fan");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String text = driver.findElement(By.xpath("((//div[@class='ZFwe0M row'])//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(text);
        Thread.sleep(2000);
        String text1 = driver.findElement(By.xpath("((//div[@class='ZFwe0M row'])[1]//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(text1);
    }
}
