package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_GetRowSize_InATable {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        List<WebElement> table = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr"));
        int tbsize = table.size();
        System.out.println(tbsize);

        int tbsize1 = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr")).size();
        System.out.println(tbsize1);

        System.out.println(driver.findElements(By.xpath("(//table[@name='BookTable'])//tr")).size());
    }
}
