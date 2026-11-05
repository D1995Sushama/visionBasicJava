package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_getTitle2 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        String actTitle= driver.getTitle();
        System.out.println(actTitle);
        String expecttitle="Facebook";
        if(actTitle.equals(expecttitle)){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }

}
