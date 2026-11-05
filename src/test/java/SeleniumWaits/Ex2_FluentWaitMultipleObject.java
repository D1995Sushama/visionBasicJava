package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex2_FluentWaitMultipleObject {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);


        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofSeconds(1 / 2));
        WebElement Simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        wait.until(ExpectedConditions.elementToBeClickable(Simple));
        Simple.click();

        FluentWait wait1=new FluentWait(driver);
        wait1.withTimeout(Duration.ofSeconds(3));
        wait1.pollingEvery(Duration.ofSeconds(1/2));
        wait1.until(ExpectedConditions.alertIsPresent());








    }
}
