package MouseOver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Wednesday1 {
    static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement result2 = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));
        Actions act3 = new Actions(driver);
        act3.scrollToElement(result2).perform();
        File scr1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest1=new File("C:\\Users\\USER\\Documents\\sush\\image\\wed.png");
        FileHandler.copy(scr1,dest1);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement scr = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        Actions act5 = new Actions(driver);
        act5.dragAndDrop(scr, dest).perform();
    }
}
