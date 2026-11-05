package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_XpathByindex {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("Sushama Deshmukh");
        driver.findElement(By.xpath("(//input[@ type='text'])[2]")).sendKeys("dsushama91@gmail.com");
    }
}
