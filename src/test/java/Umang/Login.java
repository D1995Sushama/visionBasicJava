package Umang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();//open registration & logedin page
        driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("9607718328");
        driver.findElement(By.xpath("(//input[(@inputmode='numeric')])[2]")).sendKeys("150847");
        driver.findElement(By.xpath("//button[contains(@class,'w-100')]")).click();
    }
}
