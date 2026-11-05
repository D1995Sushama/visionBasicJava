package POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginToSwagLabApp_Without_POM {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        //username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //click loginbutton
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //verify logo text
        String acttext= driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
        String expectText="Swag Labs";
        if(acttext.equals(expectText)){
            System.out.println("TC passed");
        }
        else{
            System.out.println("TC Failed");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
