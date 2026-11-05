package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Friday2 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//div[text()='In demand']"));
        File tsc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File s2=new File("C:\\Users\\USER\\Documents\\sush\\image\\my.png");
        FileHandler.copy(tsc,s2);
    }
}
