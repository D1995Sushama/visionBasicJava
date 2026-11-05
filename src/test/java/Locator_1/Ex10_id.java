package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10_id {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/USER/Desktop/velocity/HTML/Buddy%20Boy.html");
        driver.findElement(By.id("1234")).sendKeys("Sushma Dekhmukh");
        driver.findElement(By.id("1234")).sendKeys("dsushama91@gmail.com");
    }
}
