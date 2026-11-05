package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7getRatingAndReview {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("micromax mobile 5g");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String rating = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(rating);
        Thread.sleep(2000);
        String review = driver.findElement(By.xpath("(//a[@class='k7wcnx']//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(review);
        String details= driver.findElement(By.xpath("(//ul[@class='HwRTzP']//li)[1]")).getText();
        System.out.println(details);
        String details1= driver.findElement(By.xpath("(//ul[@class='HwRTzP']//li)[2]")).getText();
        System.out.println(details1);
        String details2= driver.findElement(By.xpath("(//ul[@class='HwRTzP']//li)[3]")).getText();
        System.out.println(details2);
        String details3= driver.findElement(By.xpath("(//ul[@class='HwRTzP']//li)[4]")).getText();
        System.out.println(details3);




    }
}
