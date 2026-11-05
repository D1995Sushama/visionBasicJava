package ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saturday1heedless {
    static void main(String[] args) {
        ChromeOptions op=new ChromeOptions();
        op.addArguments("--headless");
        WebDriver driver=new ChromeDriver(op);
        driver.get("https://web.umang.gov.in/");
        String text = driver.findElement(By.xpath("//strong[text()=' Login ']")).getText();
        System.out.println(text);
        driver.quit();
    }
}
