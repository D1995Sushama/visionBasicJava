package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_2_AlertPopUp1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        //enter customer ID
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abz");
        //click on submit button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //gettext from from alert popup
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);
              //click on cancel button from alert popup
      //driver.switchTo().alert().dismiss();

        //click on OK button from 1st alert popup
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        //click on OK button from 2nd alert popup
        driver.switchTo().alert().accept();

    }
}
