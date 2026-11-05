package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Friday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement color = driver.findElement(By.xpath("//select[@id='colors']"));
        Actions act=new Actions(driver);
        act.click(color).perform();

       for(int i=0;i<=7;i++){
           act.sendKeys(Keys.ARROW_DOWN).perform();
           Thread.sleep(2000);

       }
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();


    }
}
