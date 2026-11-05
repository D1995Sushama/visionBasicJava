package MouseOver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Sunday2 {
    static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        WebElement scrl1 = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));

        Actions act=new Actions(driver);
        act.scrollToElement(scrl1).perform();
        File scr1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest1=new File("C:\\Users\\USER\\Documents\\sush\\image\\flpmouse.png");
        FileHandler.copy(scr1,dest1);
        WebElement scrl2 = driver.findElement(By.xpath("//h2[text()='Scrolling DropDown']"));
        Actions  act2=new Actions(driver);
        act2.scrollToElement(scrl2).perform();
        File scr2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest2=new File("C:\\Users\\USER\\Documents\\sush\\image\\flpiscr2.png");
        FileHandler.copy(scr2,dest2);
    }
}
