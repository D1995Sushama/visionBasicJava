package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class TuesdaychildToMain {
    static void main() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> win = driver.getWindowHandles();
        ArrayList<String> s1=new ArrayList<>(win);
        driver.switchTo().window(s1.get(1));
        driver.findElement(By.xpath("//span[text()='Training']")).click();
        driver.switchTo().window(s1.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> win2 = driver.getWindowHandles();
        ArrayList<String>s2=new ArrayList<>(win2);
        driver.switchTo().window(s2.get(2));


    }
}
