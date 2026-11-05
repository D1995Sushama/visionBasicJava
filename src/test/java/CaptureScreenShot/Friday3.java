package CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Friday3 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File address = new File("C:\\Users\\USER\\Documents\\sush\\image\\face.png");
        FileHandler.copy(image,address);
    }
}
