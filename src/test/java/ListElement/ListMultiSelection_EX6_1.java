package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListMultiSelection_EX6_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement counry=driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(counry);
        boolean result= s1.isMultiple();
        System.out.println(result);
        if(result){
            System.out.println("multiple text is selected");
        }
        else{
            System.out.println("single text is selected");
        }

    }
}
