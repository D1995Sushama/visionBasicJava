package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sunday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[text()=' Register Here']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[contains(@class,'position-bounding-box')]")).click();
        WebElement state  =driver.findElement(By.xpath("//div[@id='mat-select-value-0']"));
        Actions act=new Actions(driver);
        act.click(state).perform();
        Thread.sleep(2000);
       // act.sendKeys(Keys.ARROW_DOWN).perform();
        //Thread.sleep(5000);
       // act.sendKeys(Keys.ARROW_UP).perform();
        //Thread.sleep(2000);
        //act.sendKeys(Keys.ENTER).perform();
        for(int i=0;i<=28;i++){
          act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(2000);

        }
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();
    }
}
