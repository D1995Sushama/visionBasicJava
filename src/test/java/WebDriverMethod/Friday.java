package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Friday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.get("https://www.instagram.com/");
        driver.close();



    }
}
