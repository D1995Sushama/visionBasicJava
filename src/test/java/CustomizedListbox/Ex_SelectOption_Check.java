package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_SelectOption_Check {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        driver.findElement(By.xpath("//a[@title='Services']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'state-filter')]")).click();
       WebElement state= driver.findElement(By.xpath("//input[@type='text']"));
        Actions act=new Actions(driver);
        act.click(state).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();

    }
}
