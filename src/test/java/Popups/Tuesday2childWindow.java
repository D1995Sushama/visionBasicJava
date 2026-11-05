package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Tuesday2childWindow {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> window = driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList<>(window);
        Thread.sleep(2000);
        String s1=ar.get(0);
        System.out.println(s1);
        driver.switchTo().window(ar.get(1));
        driver.findElement(By.xpath("//span[text()='Selenium']")).click();
        String s2=ar.get(1);
        System.out.println(s2);
        Thread.sleep(2000);
        //driver.switchTo().window(ar.get(0));
        //driver.findElement(By.xpath("//input[@name='NewTab']")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Appium']")).click();
        driver.switchTo().window(ar.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> allid2 = driver.getWindowHandles();
        ArrayList<String>ar1=new ArrayList<>(allid2);
        driver.switchTo().window(ar1.get(2));
        String s3=ar1.get(2);
        System.out.println(s3);
        driver.close();
        //driver.switchTo().window(ar.get(0));


    }
}
