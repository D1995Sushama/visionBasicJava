package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Thursday1SwitchtoFrame {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("(//div[@class='category-cards']//a)[3]")).click();
       driver.findElement(By.xpath("//span[text()='Frames']")).click();
       Thread.sleep(2000);
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        String text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
        String text1 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
        System.out.println(text1);

    }
}