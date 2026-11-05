package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saturday2maximized {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--start-maximized");
        Thread.sleep(2000);
        co.addArguments("--incognito");
        Thread.sleep(2000);
        co.addArguments("--disable-notification");
        Thread.sleep(2000);
        co.addArguments("--disable-popup-blocking");
        Thread.sleep(2000);
        co.addArguments("--headless-browser");
        Thread.sleep(2000);
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.quit();

    }
}
