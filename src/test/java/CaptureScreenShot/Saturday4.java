package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Saturday4 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        File pagescr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File pagedst=new File("C:\\Users\\USER\\Documents\\sush\\image\\flppage.png");
        FileHandler.copy(pagescr,pagedst);
        File scr = driver.findElement(By.xpath("((//div[@class='yiQOTv'])[3]//div[@class='css-g5y9jx'])[6]")).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\USER\\Documents\\sush\\image\\flp.png");
        FileHandler.copy(scr,dest);

    }
}
