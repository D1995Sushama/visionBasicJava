package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class monday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        WebElement target = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions act=new Actions(driver);
        act.moveToElement(target).perform();
        Thread.sleep(2000);
        act.contextClick(target).perform();
        Thread.sleep(2000);
        act.click(target).perform();
        Thread.sleep(2000);

        //Thread.sleep(2000);
        //act.click(target).perform();
    }
}