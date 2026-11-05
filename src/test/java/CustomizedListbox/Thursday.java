package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Thursday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement country = driver.findElement(By.cssSelector("#country"));
        Actions act=new Actions(driver);
        act.click(country).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        //act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();
        for(int i=0;i<=12;i++){
           act.sendKeys(Keys.ARROW_DOWN).perform();

           Thread.sleep(2000);
        }
        act.sendKeys(Keys.ENTER).perform();
        System.out.println(act.getSequences());
    }
}
