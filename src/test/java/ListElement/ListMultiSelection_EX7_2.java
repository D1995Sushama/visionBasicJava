package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListMultiSelection_EX7_2 {
    static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
         WebElement colour=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s1=new Select(colour);
        boolean result= s1.isMultiple();
        System.out.println(result);
        if(result){
            System.out.println("multiple text select");
        }
        else{
            System.out.println("single text selected");
        }
    }
}
