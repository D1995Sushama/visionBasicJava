package CaptureScreenShot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Thursday {
    static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".b3wTlE")).click();
        File scr = driver.findElement(By.xpath("(((//div[@class='css-g5y9jx r-18u37iz'])//div[@class='css-g5y9jx'])//img)[8]")).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\USER\\Documents\\sush\\image\\pro.png");
        FileHandler.copy(scr,dest);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions act=new Actions(driver);
        act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Drag and Drop']"))).perform();
        File scr1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest1=new File("C:\\Users\\USER\\Documents\\sush\\image\\scr.png");
        FileHandler.copy(scr1,dest1);
        act.contextClick(driver.findElement(By.cssSelector("#alertBtn"))).perform();
        act.click(driver.findElement(By.cssSelector("//a[text()='Online Trainings']"))).perform();
    }
}
