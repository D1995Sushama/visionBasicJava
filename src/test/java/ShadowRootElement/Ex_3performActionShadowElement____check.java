package ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_3performActionShadowElement____check{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://xqa.io/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Practice']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(@class,'text-sm text-gray')])[7]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='continue-prompt-text']")).click();
        driver.findElement(By.xpath("//div[@id='shadowHost']")).getShadowRoot().
                findElement(By.cssSelector("input[id='shadowInput']")).sendKeys("sushama");
    }
}
