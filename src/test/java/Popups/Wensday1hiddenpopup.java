package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wensday1hiddenpopup{
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mobikwik.com/");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9607718328");


    }
}
