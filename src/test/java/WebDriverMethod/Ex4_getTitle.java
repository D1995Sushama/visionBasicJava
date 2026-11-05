package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getTitle {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String acttitle= driver.getTitle();
        System.out.println(acttitle);
        System.out.println("-------------");
        System.out.println(driver.getTitle());
    }
}
