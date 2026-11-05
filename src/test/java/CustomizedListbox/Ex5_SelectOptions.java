package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_SelectOptions {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.adda247.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).click();
        WebElement java = driver.findElement(By.xpath("(//div[contains(@class,'homepage-revamp')])[23]"));
        Actions act=new Actions(driver);
        act.sendKeys(java).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();

    }
}
