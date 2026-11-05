package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOutAllOptionEx_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s1=new Select(colors);
        List<WebElement> s2= s1.getOptions();

            for(WebElement s3:s2){
                System.out.println(s3.getText());
            }
        }
    }

