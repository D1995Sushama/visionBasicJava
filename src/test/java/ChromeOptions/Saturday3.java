package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saturday3 {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--start-maximized");
        co.addArguments("--incognito");
        co.addArguments("--disable-notifications");
        co.addArguments("--heedless");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://web.umang.gov.in/");
        Thread.sleep(2000);
        driver.quit();
    }

}
