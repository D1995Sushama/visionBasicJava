package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_GetRowSize_InATable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int noofrow = row.size();
        System.out.println(noofrow);
        int noofrow1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(noofrow1);
        System.out.println( driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());

    }
}
