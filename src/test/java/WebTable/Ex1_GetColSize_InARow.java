package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_GetColSize_InARow {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        List<WebElement> column = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr/th"));
        System.out.println(column.size());
        Thread.sleep(2000);
        int column1 = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr/th")).size();
        System.out.println(column1);
        System.out.println(driver.findElements(By.xpath("(//table[@name='BookTable'])//tr/th")).size());



    }
}
