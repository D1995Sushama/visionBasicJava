package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_quit {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.anandmaratha.com");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.flipkart.com/");
        driver.quit();
    }
}
