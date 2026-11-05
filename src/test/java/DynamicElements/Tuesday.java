package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tuesday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url=driver.getCurrentUrl();
        System.out.println("Current url is"+url);
        String title=driver.getTitle();
        System.out.println("Current title is"+title);
        driver.findElement(By.cssSelector("*.b3wTlE")).click();
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("tv 32 inches");
        driver.findElement(By.cssSelector("*.XFwMiH")).click();
        WebElement rating= driver.findElement(By.xpath("(//div[@class='col col-7-12']//div[3]//span[@class='PvbNMB'])//span[1]"));
        System.out.println("Review is"+rating.getText());
        WebElement review = driver.findElement(By.xpath("(//div[@class='a7saXW']//span[@class='PvbNMB']//span)[4]"));
        System.out.println("Review is"+review.getText());
    }
}
