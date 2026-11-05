package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2getRatingAndReviews {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("wipro 2 door fridge");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String ratings = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(ratings);
        String review = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(review);
    }
}
