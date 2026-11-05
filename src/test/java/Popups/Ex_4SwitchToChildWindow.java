package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex_4SwitchToChildWindow {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> hand = driver.getWindowHandles();
        ArrayList<String> a1=new ArrayList<>(hand);
         String childWindow=a1.get(1);
         driver.switchTo().window(childWindow);
         driver.findElement(By.xpath("//span[text()='Training']")).click();
    }
}
