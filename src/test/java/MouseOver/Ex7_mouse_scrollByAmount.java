package MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_mouse_scrollByAmount {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        Actions s1=new Actions(driver);
        //scroll down - 1st para=0, 2nd para=+ve  pixel value
        s1.scrollByAmount(0,900).perform();
        //Thread.sleep(2000);
        //scroll up - 1st para=0, 2nd para=-ve  pixel value
        s1.scrollByAmount(0,-400).perform();
        //scroll right - 1st para=+ve, 2nd para=0  pixel value
       //  s1.scrollByAmount(100,0).perform();

        //scroll right - 1st para=-ve, 2nd para=0  pixel value
        //s1.scrollByAmount(-100,0).perform();




    }
}
