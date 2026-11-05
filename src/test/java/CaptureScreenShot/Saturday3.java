package CaptureScreenShot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Saturday3 {
    static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        File pic = driver.findElement(By.xpath("((//div[@class='yiQOTv'])[2]//div[@class='css-g5y9jx'])[3]")).getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\USER\\Documents\\sush\\image\\flip2.png");
        FileHandler.copy(pic, des);
        //driver.findElement(By.xpath(""));
        File pic1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File des1 = new File("C:\\Users\\USER\\Documents\\sush\\image\\flipage.png");
        FileHandler.copy(pic1,des1);

    }
}
