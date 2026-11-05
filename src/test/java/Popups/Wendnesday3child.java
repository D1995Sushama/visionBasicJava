package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Wendnesday3child {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> allid = driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList<>(allid);
        driver.switchTo().window(ar.get(1));
        String s1=ar.get(1);
        System.out.println(s1);
        driver.findElement(By.xpath("//span[text()='Training']")).click();
        driver.switchTo().window(ar.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> allid2 = driver.getWindowHandles();
        ArrayList<String>ar2 = new ArrayList<>(allid2);
        driver.switchTo().window(ar2.get(2));
        String s2=ar2.get(2);
        System.out.println(s2);
    }
}
