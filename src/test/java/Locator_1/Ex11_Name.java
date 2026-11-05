package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11_Name {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/USER/Desktop/velocity/HTML/Buddy%20Boy.html");
        driver.findElement(By.name("username")).sendKeys("sushama");
        driver.findElement(By.name("passward")).sendKeys("12345678");

    }
}
