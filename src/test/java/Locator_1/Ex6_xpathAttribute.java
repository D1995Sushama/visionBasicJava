package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_xpathAttribute {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[text()='username webauthn']")).sendKeys("9607718328");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[text()='password']")).sendKeys("12345");
    }
}
