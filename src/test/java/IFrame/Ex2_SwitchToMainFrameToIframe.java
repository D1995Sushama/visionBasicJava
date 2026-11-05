package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwitchToMainFrameToIframe {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        //Switch to frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
        //click on date & time button from iframe
        driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
        //switch to main Page from iframe
//        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();
        //click on open menu option from main page
        driver.findElement(By.xpath("//a[@id='menuButton']")).click();
    }
}
