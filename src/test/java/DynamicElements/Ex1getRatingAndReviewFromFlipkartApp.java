package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1getRatingAndReviewFromFlipkartApp {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("samsung s20 fe 5g");
        driver.findElement(By.xpath("//button[@class='XFwMiH']")).click();
        String rating = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(rating);
        String reviews = driver.findElement(By.xpath("(//div[@class='jIjQ8S'])[1]// span[@class='PvbNMB']//span[3]")).getText();
        System.out.println(reviews);
        driver.quit();
    }
}
