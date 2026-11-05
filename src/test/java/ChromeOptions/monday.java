package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class monday {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--start-maximized");
        co.addArguments("--incognito");
        Thread.sleep(2000);
        co.addArguments("--disable-popup-blocking");
        Thread.sleep(2000);
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.quit();
    }
}
