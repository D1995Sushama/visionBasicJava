package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.WINDOW);
        System.out.println("---------------");
        Thread.sleep(3000);
        driver.navigate().to("https://web.umang.gov.in/landing/");
        String url1=driver.getCurrentUrl();
        System.out.println(url1);
        String title1=driver.getTitle();
        System.out.println(title1);
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.quit();
    }

}
