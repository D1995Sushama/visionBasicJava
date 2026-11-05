package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_mouse_leftClickAction {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        //Apr 1
       // act.moveToElement(cart).perform();
       // act.click().perform();
        //Apr 2
        //act.moveToElement(cart).click().perform();
        //Apr 3
        act.click(cart).perform();
    }
}
