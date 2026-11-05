package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex3_headlessBrowser {
    static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        //co.addArguments("--start-maximized");
        //co.addArguments("-incognito");
        co.addArguments("--headless");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
    }
}
