package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monday1 {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        //co.addArguments("--headless");
        Thread.sleep(2000);
        co.addArguments("--start-maximized");
        Thread.sleep(2000);
        co.addArguments("--incognito");
        Thread.sleep(2000);
        co.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.quit();
    }
}
