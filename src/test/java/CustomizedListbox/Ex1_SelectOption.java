package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_SelectOption {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Actions s1=new Actions(driver);
        s1.click(country).perform();

        s1.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        s1.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        s1.sendKeys(Keys.ENTER).perform();
    }
}
