package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Sunday1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement scr = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
        Actions act1=new Actions(driver);
        act1.dragAndDrop(scr,dest).perform();

    }
}
