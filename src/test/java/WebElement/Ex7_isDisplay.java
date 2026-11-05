package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_isDisplay {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        boolean result = false;
        try {
            result = driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
        }
        catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }
        System.out.println(result);
        if(result){
            System.out.println("Element Present");
        }
        else{
            System.out.println("Element Is Not Present");
        }
    }
}