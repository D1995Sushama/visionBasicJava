package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.Option;

public class Ex8_Minimize {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().minimize();
       // Option.s1= driver.manage();
        //WebDriver.Window s2=s1.window();
       // s2.minimize();
    }
}
