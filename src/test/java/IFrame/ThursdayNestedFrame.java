package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThursdayNestedFrame {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//div[@class='category-cards']//a)[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        String text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println(text1);

    }
}
