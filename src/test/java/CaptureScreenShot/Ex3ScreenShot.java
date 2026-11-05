package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex3ScreenShot {
    static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        File scr = driver.findElement(By.xpath("(//div[contains(@style,'display:flex;flex')]//div)[88]")).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\USER\\Documents\\sush\\image\\pop1.png");
        FileHandler.copy(scr,dest);
    }
}
