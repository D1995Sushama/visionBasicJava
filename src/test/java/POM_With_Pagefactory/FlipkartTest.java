package POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FlipkartTest {
    static void main(String[] args) {

    }
    public static void loginvalidcredential(){
        WebDriver driver=new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.xpath("//span[@role='button']")).click();
            driver.findElement(By.xpath("//a[@title='Login']")).click();
        }

}
