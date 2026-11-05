package POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class UmangWithoutPom {
    static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://web.umang.gov.in/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='mob']")).sendKeys("9607718328");
        driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("140895");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        String acttext = driver.findElement(By.xpath("//span[text()='Know Your DigiPin ']")).getText();
        System.out.println(acttext);
        String expecttext="Know Your DigiPin";
        if (acttext.equals(expecttext)) {

            System.out.println("Tc Pass");
        }
        else{
            System.out.println("Tc Fail");
        }

    }
}
