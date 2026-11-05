package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3getRatingAndReviewAmazon {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cocopeat for plants");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
    }
}