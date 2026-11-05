package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_GetRowSizeATable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> rowno1 = driver.findElements(By.xpath("//table[@id='taskTable']//th"));
        int no = rowno1.size();
        System.out.println(no);
        int Rowno = driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();
        System.out.println(Rowno);
        System.out.println(driver.findElements(By.xpath("//table[@id='taskTable']//th")).size());
    }
}
