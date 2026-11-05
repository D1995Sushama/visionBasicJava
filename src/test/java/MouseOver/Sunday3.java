package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sunday3 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions act=new Actions(driver);
        act.scrollByAmount(0,800).perform();
        Thread.sleep(2000);
        act.scrollByAmount(0,-400).perform();
    }
}
