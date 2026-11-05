package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Tuesday5 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        Set<String> allid = driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList(allid);
        String s1=ar.get(0);
        String s2=ar.get(1);
        //String s3=ar.get(2);
        Thread.sleep(2000);
        driver.switchTo().window(s2);
        driver.findElement(By.xpath("//span[text()='JavaForQA']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(s1);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(2000);
        Set<String> allid1 = driver.getWindowHandles();
        ArrayList<String> ar1=new ArrayList(allid1);
        String s3=ar1.get(0);
        driver.switchTo().window(s3);
        Thread.sleep(2000);
        driver.close();


    }
}
