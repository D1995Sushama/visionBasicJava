package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class Ex4_text {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String text =driver.findElement(By.xpath("(//a[text()='Home'])[1]")).getText();
        System.out.println(text);
       String result= driver.findElement(By.xpath("//a[text()='Udemy Courses']")).getText();
        System.out.println(result);
        System.out.println("-------------------");
        System.out.println(driver.findElement(By.xpath("(//a[text()='Home'])[1]")).getText());
    }
}