package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6getRatingAndReview {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("ac 1.5 ton");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String rating = driver.findElement(By.xpath("(//div[@class='jIjQ8S']//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(rating);
        String review = driver.findElement(By.xpath("(//div[@class='jIjQ8S']//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(review);
    }
}
