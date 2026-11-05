package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Monday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("tv");
        Thread.sleep(2000);
        List<WebElement> actresult = driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR')]"));
        String expectresult="tv 32 inches";
        for(WebElement text:actresult){
            String result = text.getText();
            System.out.println(result);
            System.out.println("--------------------");
            if(result.equals(expectresult)) {
                text.click();
                break;
            }

        }

    }
}
