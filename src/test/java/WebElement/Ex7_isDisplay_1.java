package WebElement;

import Assignment.WebDriverMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_isDisplay_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        boolean result=false;

        try {
            result = driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
        }
        catch(NoSuchElementException e){
            System.out.println("Element Exception Handle");
        }
        System.out.println(result);
        if(result){
            System.out.println("Element is Present");
        }
        else{
            System.out.println("Element is Not Present");
        }
    }
}
