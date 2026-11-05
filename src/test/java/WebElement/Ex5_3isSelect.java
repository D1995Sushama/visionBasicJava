package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_3isSelect {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement day=driver.findElement(By.xpath("//input[@id='sunday']"));
        day.click();
         Thread.sleep(2000);
         boolean result= day.isSelected();
         System.out.println(result);
         if(result){
             System.out.println("Select check box");
         }
         else{
             System.out.println("De-selected check box");
         }
    }
}
