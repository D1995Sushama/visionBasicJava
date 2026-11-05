package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sunday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("syrum");
        Thread.sleep(2000);
        List<WebElement> actresult = driver.findElements(By.xpath("//ul[contains(@style,'border-radius: 16px; background-color')]"));
        String expectresult="plum serum";
        for(WebElement option:actresult){
            //System.out.println(option.getText());

            if(actresult.equals(expectresult)){
                option.click();
                System.out.println("pass");
            }
            //else{
               // System.out.println("fail");
            //}
        }
        System.out.println(actresult.size());

    }
}
