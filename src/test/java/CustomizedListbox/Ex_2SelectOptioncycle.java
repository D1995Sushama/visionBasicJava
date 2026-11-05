package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_2SelectOptioncycle {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        WebElement option = driver.findElement(By.xpath("//select[@id='country']"));
        Actions act=new Actions(driver);
        act.sendKeys(option).perform();
        for(int i=0;i<=10;i++){
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(2000);

        }
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();


    }
}
