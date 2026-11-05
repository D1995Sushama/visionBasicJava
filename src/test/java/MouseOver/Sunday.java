package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Sunday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        WebElement target = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions act=new Actions(driver);
        act.moveToElement(target).perform();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[text()='Orders']")).click();
        act.contextClick(target).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Fashion']")).click();

        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement scr = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
        Actions act1=new Actions(driver);
        act1.dragAndDrop(scr,dest).perform();


    }
}
