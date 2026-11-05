package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11_Opennewwindow {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.quit();
    }
}
