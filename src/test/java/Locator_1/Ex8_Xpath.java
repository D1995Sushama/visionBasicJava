package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_Xpath {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();//open registration & logedin page
        driver.findElement(By.xpath("//strong[@class='primary-text']")).click();//select registration
        driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-flex'][2]")).click();//select state
        driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@placeholder='Enter your MPIN']")).sendKeys("150847");
        driver.findElement(By.xpath("//button[contains(@class,'w-100')]")).click();
        driver.findElement(By.xpath("(//span[@class,'mat-mdc')][2]")).click();
    }
}//div[@class()='mat-mdc-form-field-focus-overlay']
