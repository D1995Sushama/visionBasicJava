package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Tuesday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement contry = driver.findElement(By.xpath("//select[@id='country']"));
        Actions act=new Actions(driver);
        act.click(contry).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ARROW_UP).perform();
        act.sendKeys(Keys.ENTER).perform();
        for(int i=0;i<=10;i++){
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(2000);
            act.sendKeys(Keys.ENTER).perform();
        }
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();



    }
}
