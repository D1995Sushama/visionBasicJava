package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex10_selectTv {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("Tv");
        Thread.sleep(2000);
        List<WebElement> tv = driver.findElements(By.xpath("//ul[contains(@style,'border-radius: 16px;')]"));
        String expected= "tv 55 inch";
        for(WebElement acttv:tv) {
            String result = acttv.getText();
            System.out.println(result);
           if (result.equals(expected)) {
               acttv.click();
                break;
           }


        }
    }
}
