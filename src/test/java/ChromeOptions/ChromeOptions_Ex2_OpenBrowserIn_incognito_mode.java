package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex2_OpenBrowserIn_incognito_mode {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--start-maximized");
        co.addArguments("-incognito");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.quit();
    }
}
