package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Ex1_PerformActionOnMouseOverElement {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //click on close icon
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        //Step1: Identify mouse over element
        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
        //Step2: Create an object of Actions class with webdriver object as a input
        Actions act = new Actions(driver);
        //step3: call Actions class method-moveToElement()
        act.moveToElement(login).perform();
        //click on Order link from mouse over element
        driver.findElement(By.xpath("//div[text()='Orders']")).click();
        driver.close();

    }
}
