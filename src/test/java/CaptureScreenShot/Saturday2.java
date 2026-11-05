package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Saturday2 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/landing/");
        File img = driver.findElement(By.xpath("//img[@class='light-mode-umg'][1]")).getScreenshotAs(OutputType.FILE);
        System.out.println(img);
        File add=new File("C:\\Users\\USER\\Documents\\sush\\image\\img4.png");
        FileHandler.copy(img,add);
    }
}
