package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex1_FluentWait {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));//Specify the timeout of the wait
        wait.pollingEvery(Duration.ofSeconds(1/5)); //Specify polling time
       // wait.ignoring(NoSuchFieldException.class); //Specify what exceptions to ignore
        WebElement start = driver.findElement(By.xpath("//button[text()='START']"));
        wait.until(ExpectedConditions.elementToBeClickable(start));
        start.click();
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
