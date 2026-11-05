package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_1SelectOption_Aus {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Actions act=new Actions(driver);
        act.click(country).perform();
        for(int i=1;i<=10;i++){
            act.sendKeys(Keys.ARROW_DOWN).perform();
           Thread.sleep(2000);
        }
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();


    }
}
