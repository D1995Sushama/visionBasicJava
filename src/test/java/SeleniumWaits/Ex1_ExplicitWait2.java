package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex1_ExplicitWait2 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));

        WebElement start = driver.findElement(By.xpath("//button[@class='start']"));
        wait.until(ExpectedConditions.elementToBeClickable(start));
        start.click();

        WebElement simplealert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Simple Alert']")));
        simplealert.click();
        wait.until(ExpectedConditions.alertIsPresent());



    }
}
