package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@dir='auto']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@dir='auto'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@dir='auto'])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//img[contains(@src,'https://static-assets-web.flixcart.com')])[2]")).click();
        driver.quit();
    }
}
