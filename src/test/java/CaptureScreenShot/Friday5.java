package CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Friday5 {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        driver.manage().window().maximize();
        File img = driver.findElement(By.xpath("(//img[@loading='lazy'])[1]")).getScreenshotAs(OutputType.FILE);
        System.out.println(img);
        File add=new File("C:\\Users\\USER\\Documents\\sush\\image\\img.png");
        FileHandler.copy(img,add);

    }
}
