package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_getallFan {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("fan");
        Thread.sleep(2000);
        List<WebElement> fridge = driver.findElements(By.xpath("//ul [contains(@style,'border-radius: 16px')]"));
        for(WebElement allfridge:fridge){
            String s1 = allfridge.getText();
            System.out.println(s1);
        }
        driver.quit();
    }
}
