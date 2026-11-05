package IFrame;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thursday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@id='menuButton']")).click();
        String url = driver.switchTo().parentFrame().getCurrentUrl();
        System.out.println(url);
        //driver.findElement(By.xpath("//iframe[@name='__tcfapiLocator']")).click();


    }
}
