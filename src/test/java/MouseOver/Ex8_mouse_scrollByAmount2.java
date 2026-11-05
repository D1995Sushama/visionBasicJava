package MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex8_mouse_scrollByAmount2 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions s1=new Actions(driver);
        for(int i=1;i<=30;i++){
            s1.scrollByAmount(0,100).perform();
            Thread.sleep(2000);
        }
    }
}
