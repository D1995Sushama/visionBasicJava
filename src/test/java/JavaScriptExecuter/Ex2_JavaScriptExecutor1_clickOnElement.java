package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_JavaScriptExecutor1_clickOnElement {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement PointMe = driver.findElement(By.xpath("//button[text()='Point Me']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", PointMe);
    }
}
