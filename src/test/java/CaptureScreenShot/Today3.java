package CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Today3 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dsk=new File("C:\\Users\\USER\\Documents\\sush\\image\\PKL.png");
        FileHandler.copy(scr,dsk);
    }
}
