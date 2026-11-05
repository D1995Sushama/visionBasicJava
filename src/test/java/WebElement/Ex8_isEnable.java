package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_isEnable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://sauce-demo.myshopify.com/");
        driver.findElement(By.xpath("//a[@id='customer_login_link']")).click();
        boolean result=false;
        try {
            result = driver.findElement(By.xpath("//input[@class='button']")).isEnabled();
        }
        catch(NoSuchElementException e) {
            System.out.println("Element Exception Handeled");
        }
        System.out.println(result);
        if(result){
            System.out.println("Element is Enable");
        }
        else{
            System.out.println("Element is Disable");
        }
    }
}
