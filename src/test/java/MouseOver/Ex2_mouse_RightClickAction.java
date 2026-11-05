package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_mouse_RightClickAction {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
        Actions act=new Actions(driver);
        //Apr1
//        act.moveToElement(cart).perform();
//        act.contextClick().perform();

        //Apr2:
//        act.moveToElement(cart).contextClick().perform();

//        Apr3
        act.contextClick(cart).perform();
    }
}
