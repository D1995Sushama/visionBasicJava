package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#_R_c9l6neappb6amH1_")).sendKeys("9607718328");
        driver.findElement(By.cssSelector("#_R_cdl6neappb6amH1_")).sendKeys("12345");
        driver.findElement(By.cssSelector("div[role='none']")).click();
    }
}
