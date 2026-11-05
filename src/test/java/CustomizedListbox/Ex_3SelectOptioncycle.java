package CustomizedListbox;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_3SelectOptioncycle {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        WebElement colour = driver.findElement(By.xpath("//select[@id='colors']"));

        Actions act=new Actions(driver);
        act.sendKeys(colour).perform();
        Thread.sleep(2000);
        for(int i=0;i<=7;i++){
            act.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);
        }
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
    }
}
