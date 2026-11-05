package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex7_getalloneplus {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("oneplus");
        Thread.sleep(2000);
        List<WebElement> oneplus = driver.findElements(By.xpath("//ul[contains(@class,'_1psv1ze7c _1cisqlf2')]"));
        for(WebElement allopeplus:oneplus){
            String s1 = allopeplus.getText();
            System.out.println(s1);
        }

    }
}
