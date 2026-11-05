package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuesday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/landing/");
        Thread.sleep(5000);
        driver.get("https://www.flipkart.com/");
        driver.close();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }
}
