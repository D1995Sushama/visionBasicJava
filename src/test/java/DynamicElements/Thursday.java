package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Thursday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".b3wTlE")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("mobile");
        List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR')]"));
        String expectpro="mobile under 20000rs";
        for(WebElement pro:option){
            System.out.println(pro.getText());
            String actpro = pro.getText();
            if(actpro.equals(expectpro)){
              pro.click();
              break;
           }
        }
        driver.findElement(By.xpath("//ul[contains(@class,'VCplLH lTpUwR')]//li[3]")).click();
        String reviewrating = driver.findElement(By.xpath("(//a[@class='k7wcnx']//div//span[@class='PvbNMB'])[2]")).getText();
        System.out.println(reviewrating);

       // driver.findElement(By.cssSelector("")).click();
    }
}
