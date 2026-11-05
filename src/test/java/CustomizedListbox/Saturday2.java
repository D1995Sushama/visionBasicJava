package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Saturday2 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        WebElement option = driver.findElement(By.xpath("//select[@id='colors']"));
        Actions act=new Actions(driver);
        for(int i=0;i<=7;i++){
            act.click(option).perform();
            act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        act.sendKeys(Keys.ENTER).perform();
    }
}
