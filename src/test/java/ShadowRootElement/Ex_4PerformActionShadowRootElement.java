package ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_4PerformActionShadowRootElement {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("chrome://newtab");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("cr-searchbox-input[id='input']")).getShadowRoot().
                findElement(By.cssSelector("textarea[id='input']")).sendKeys("flipkart");
    }
}
