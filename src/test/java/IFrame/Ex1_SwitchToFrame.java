package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToFrame {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        //Switch to frame
//        driver.switchTo().frame("iframeResult");        //frameIdOrName
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
        //        driver.switchTo().frame(0)         frame Index

        //click on date & time button

        driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
    }
}
