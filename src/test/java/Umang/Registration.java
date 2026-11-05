package Umang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();//open registration & logedin page
        driver.findElement(By.xpath("//strong[@class='primary-text']")).click();//select registration
        driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//span[contains(@class,'select-placeholder')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search State']")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("span[@class='mdc-list-item__primary-text']")).click();
        driver.findElement(By.xpath("//span[contains(@class,'mdc-list-item')][19]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id=''mat-mdc-checkbox-0-input]")).click();
    }
}
