package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex3_ImplicitWait____check {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        WebElement close = driver.findElement(By.xpath("//span[@role='button']"));
        wait.until(ExpectedConditions.elementToBeClickable(close));
        close.click();

        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        wait.until(ExpectedConditions.elementToBeSelected(text));
        text.sendKeys("tv");
    }
}
