package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_getallTVName {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tv");
        Thread.sleep(2000);
        List<WebElement> tv = driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR')]"));
        for(WebElement alltv:tv){
            String s1 = alltv.getText();
            System.out.println(s1);
        }
    }
}
