package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Saturday1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.xpath("//input[@style='color:#3d3d3dff']")).sendKeys("mobile");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String rating = driver.findElement(By.xpath("(//a[@target='_blank']//div[@class='ZFwe0M row']//span[@class='PvbNMB'])[2]")).getText();
        System.out.println(rating);
        String review = driver.findElement(By.xpath("(//a[@target='_blank']//div[@class='ZFwe0M row']//span[@class='PvbNMB'])[4]")).getText();
        System.out.println(review);


    }
    }

