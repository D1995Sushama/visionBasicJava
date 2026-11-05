package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://web.umang.gov.in/landing/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver .navigate().to("https://www.facebook.com/");
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
