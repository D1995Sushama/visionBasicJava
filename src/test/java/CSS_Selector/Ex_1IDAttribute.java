package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1IDAttribute {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input#name")).sendKeys("abc");
//        driver.findElement(By.cssSelector("*#name")).sendKeys("abc");
        driver.findElement(By.cssSelector("#name")).sendKeys("sushama");
        driver.findElement(By.cssSelector("input#email")).sendKeys("sushama@8.gmail.com");
    }
}
