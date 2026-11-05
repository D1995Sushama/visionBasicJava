package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_GetNumberOfColumn {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> columnnum = driver.findElements(By.xpath("//table[@id='productTable']//tr/th"));
        int num1 = columnnum.size();
        System.out.println(num1);
        int num2 = driver.findElements(By.xpath("//table[@id='productTable']//tr/th")).size();
        System.out.println(num2);
        System.out.println( driver.findElements(By.xpath("//table[@id='productTable']//tr/th")).size());

    }
}
