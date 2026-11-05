package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12_OpennewTab {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
         driver.quit();
    }
}
