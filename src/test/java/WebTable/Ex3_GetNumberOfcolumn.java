package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_GetNumberOfcolumn {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> columnno = driver.findElements((By.xpath("//table[@id='taskTable']//tr/th")));
        int num = columnno.size();
        System.out.println(num);
        int num2 = driver.findElements((By.xpath("//table[@id='taskTable']//tr/th"))).size();
        System.out.println(num2);
        System.out.println(driver.findElements((By.xpath("//table[@id='taskTable']//tr/th"))).size());
    }
}
