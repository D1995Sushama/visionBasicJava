package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex_5SwitchMainWindowFromChildWindow1 {
    static void main() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> win1 = driver.getWindowHandles();
        ArrayList<String>s1=new ArrayList<>(win1);
        driver.switchTo().window(s1.get(1));
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        driver.switchTo().window(s1.get(0));
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
    }
}
