package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Monday4SwitchToChildWindow {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Set<String> result = driver.getWindowHandles();
        ArrayList<String> a1 = new ArrayList<>(result);
        String chil = a1.get(1);
        driver.switchTo().window(chil);
        driver.findElement(By.xpath("//span[text()='Training']")).click();

    }
}