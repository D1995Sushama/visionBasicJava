package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex13_linkTest {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/landing/");
        driver.findElement(By.linkText("Schemes")).click();
        driver.findElement((By.linkText("Jobs"))).click();
    }
}
