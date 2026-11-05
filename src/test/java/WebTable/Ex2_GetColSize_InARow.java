package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_GetColSize_InARow {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> columnnum = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
        int num = columnnum.size();
        System.out.println(num);
        int columnnum1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
        System.out.println(columnnum1);
        System.out.println( driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size());
    }
}
