package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class monday2 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("\"https://testautomationpractice.blogspot.com/"));
        WebElement scrol1 = driver.findElement(By.xpath("//button[text()='Point Me']"));
        Actions act=new Actions(driver);
        act.scrollToElement(scrol1).perform();

    }
}
