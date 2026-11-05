package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_GetRowSizeInTable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        int rowno = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
        System.out.println(rowno);
        List<WebElement> rowno1 = driver.findElements(By.xpath("//table[@id='productTable']//tr"));
        int ttrow = rowno1.size();
        System.out.println(ttrow);

    }
}
