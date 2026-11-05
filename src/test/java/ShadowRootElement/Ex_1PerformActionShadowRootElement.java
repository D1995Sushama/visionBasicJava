package ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1PerformActionShadowRootElement {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://watir.com/examples/shadow_dom.html");
        driver.findElement(By.xpath("//div[@id='shadow_host']")).getShadowRoot().
                findElement(By.cssSelector("input[type='text']")).sendKeys("sushama");
    }
}
