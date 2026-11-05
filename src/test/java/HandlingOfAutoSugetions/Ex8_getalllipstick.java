package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex8_getalllipstick {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("lipstick");
        Thread.sleep(2000);
        List<WebElement> lipstick = driver.findElements(By.xpath("(//ul[contains(@style,'border-radius: 16px;')])[1]"));
        for(WebElement allproduct:lipstick){
            String s = allproduct.getText();
            Thread.sleep(2000);
            System.out.println(s);
        }

    }
}
