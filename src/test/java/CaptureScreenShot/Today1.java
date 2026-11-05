package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Today1 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        File scr = driver.findElement(By.xpath("//button[text()='Point Me']")).getScreenshotAs(OutputType.FILE);
       // System.out.println(scr);
        File dsc=new File("C:\\Users\\USER\\Documents\\sush\\image\\Skf.png");
        FileHandler.copy(scr,dsc);
    }
}
