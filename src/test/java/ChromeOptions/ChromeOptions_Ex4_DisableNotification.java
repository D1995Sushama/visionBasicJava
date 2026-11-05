package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex4_DisableNotification {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--disable-notification");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://useinsider.com/");
        Thread.sleep(2000);
        driver.quit();


    }

}
