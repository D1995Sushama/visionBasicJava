package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex11_selectFan {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("Fan");
        List<WebElement> fan = driver.findElements(By.xpath("//ul[contains(@style,'border-radius: 16px')]"));
        String expected="BLDC Fans";
        Thread.sleep(2000);
        for(WebElement actfan:fan) {
            actfan.equals(expected);
                Thread.sleep(2000);
                actfan.click();

        }
    }
}
