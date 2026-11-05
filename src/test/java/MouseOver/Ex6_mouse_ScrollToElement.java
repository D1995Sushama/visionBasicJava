package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_mouse_ScrollToElement {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions s1=new Actions(driver);
        WebElement home= driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
        s1.scrollToElement(home).perform();
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("(//button[text()='Submit'])[4]"));
        s1.scrollToElement(submit).perform();
    }
}
