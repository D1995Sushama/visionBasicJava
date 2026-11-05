package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Tuesday4 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> allid = driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList<>(allid);
        driver.switchTo().window(ar.get(1));
        driver.findElement(By.xpath("//span[text()='JavaForQA']")).click();
        driver.switchTo().window(ar.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> allid1 = driver.getWindowHandles();
        ArrayList<String>ar1=new ArrayList(allid1);
        String s3=ar1.get(2);
        driver.switchTo().window(ar1.get(2));
        driver.close();

    }
}
