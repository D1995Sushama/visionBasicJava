package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_Tagname {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.tagName("input")).sendKeys("Sushama Deshmukh");
        driver.findElement(By.tagName("input")).sendKeys("dsushama91@gmail.com");
    }
}
