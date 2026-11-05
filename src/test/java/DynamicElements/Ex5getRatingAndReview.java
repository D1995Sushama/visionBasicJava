package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5getRatingAndReview {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aquaguard water purifier");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String title = driver.findElement(By.xpath("//a[@class='k7wcnx']//div[@class='RG5Slk']")).getText();
        System.out.println(title);
        Thread.sleep(2000);
        String rating = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(rating);
        Thread.sleep(2000);
        String review = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(review);
    }
}
