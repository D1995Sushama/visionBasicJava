package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Thursdaychild {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> allid = driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList<>(allid);
        String text = ar.get(1);
        String text2=ar.get(0);
        System.out.println(text2);
        System.out.println(text);
        driver.switchTo().window(ar.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Training']")).click();
        driver.switchTo().window(ar.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> allid1 = driver.getWindowHandles();
        ArrayList<String>ar1=new ArrayList<>(allid1);
        String text1 = ar1.get(2);
        System.out.println(text1);
        driver.switchTo().window(ar1.get(2));
        driver.close();
    }
}
