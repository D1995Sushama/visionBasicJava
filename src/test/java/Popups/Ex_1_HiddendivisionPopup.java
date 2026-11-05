package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1_HiddendivisionPopup {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mobikwik.com/");
        driver.manage().window().maximize();
        //click on login button
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        //perform action on hidden division popup
        //enter mobile number
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9607718328");
    }

}
