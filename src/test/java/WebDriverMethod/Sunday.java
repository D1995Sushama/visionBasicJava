package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday {
    public static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        String actTitle= driver.getTitle();
        String expTitle="Google";
        String url=driver.getCurrentUrl();
        System.out.println(url);
        if( actTitle.equals(expTitle)){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(actTitle);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        Thread.sleep(4000);
        driver.close();
    }
}
