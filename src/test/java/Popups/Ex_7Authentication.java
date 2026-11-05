package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_7Authentication {
    static void main() {
        WebDriver driver=new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
       // url=  https://UN:PWD@remianingURL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
