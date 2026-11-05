package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2CaptuserScreenShot {
    static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        File src = driver.findElement(By.xpath("(//img[@loading='lazy'])[3]")).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\USER\\Documents\\sush\\image\\flip1.png");
        FileHandler.copy(src,dest);
    }
}
