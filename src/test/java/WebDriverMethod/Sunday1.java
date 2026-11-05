package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        driver.navigate().to("https://web.umang.gov.in/landing/");
        String url2=driver.getCurrentUrl();
        String title2=driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.quit();

    }

}
