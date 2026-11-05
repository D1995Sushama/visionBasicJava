package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12_className {
    static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/USER/Desktop/velocity/HTML/Buddy%20Boy.html");
    driver.findElement(By.className("5678")).sendKeys("sushama");
    driver.findElement(By.className("9765")).sendKeys("dst@12345");
    }
}
