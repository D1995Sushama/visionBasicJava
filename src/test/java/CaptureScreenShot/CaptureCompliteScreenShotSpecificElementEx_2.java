package CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureCompliteScreenShotSpecificElementEx_2 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File desc=new File("C:\\Users\\USER\\Documents\\sush\\image\\Screen.png");
        FileHandler.copy(scr,desc);
    }

}
