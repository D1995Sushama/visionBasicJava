package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Tuesday3 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> allid = driver.getWindowHandles();
        ArrayList<String> ar =new ArrayList(allid);
        driver.switchTo().window(ar.get(1));
        String s1=ar.get(0);
        System.out.println(s1);
        String s2=ar.get(1);
        System.out.println(s2);
        driver.findElement(By.xpath("//span[text()='WebdriverIO']")).click();
        driver.switchTo().window(ar.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> allid2 = driver.getWindowHandles();
        ArrayList<String>ar2=new ArrayList<>(allid2);
        driver.switchTo().window(ar2.get(2));
        String s3=ar2.get(2);
        System.out.println(s3);
        driver.close();
    }
}
