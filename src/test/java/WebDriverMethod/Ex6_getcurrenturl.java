package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_getcurrenturl {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        System.out.println("----------------");
        System.out.println(driver.getCurrentUrl());
    }
}
