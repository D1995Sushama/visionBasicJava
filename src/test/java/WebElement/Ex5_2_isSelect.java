package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_2_isSelect {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        boolean result= driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();
        System.out.println(result);
        if(result){
            System.out.println("check box is selected");
        }
        else{
            System.out.println("De-selected the check box");
        }
    }
}
