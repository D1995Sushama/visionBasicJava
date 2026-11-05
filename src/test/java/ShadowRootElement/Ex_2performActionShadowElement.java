package ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_2performActionShadowElement {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Practice hub']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Shadow DOM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//practice-shadow-box")).getShadowRoot().
                findElement(By.cssSelector("input[id='shadow-input']")).sendKeys("abc");
    }
}
