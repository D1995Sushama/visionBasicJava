package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Wednesday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("*.b3wTlE")).click();
        WebElement result = driver.findElement(By.cssSelector("*.K05FV0"));
        Actions act=new Actions(driver);
        act.moveToElement(result).perform();
        act.contextClick(result).perform();
        act.click(result).perform();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement result1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act2=new Actions(driver);
        act2.doubleClick(result1).perform();



    }
}
