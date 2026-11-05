package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex5GetRowSizeInATable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.qafeast.com/");
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//a[text()='Tools']")).click();
        driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
        driver.findElement(By.xpath("(//ul[@class='lftside-lists']//li)[14]")).click();
        List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='webtable-table']//tr"));
        int num = rowno.size();
        System.out.println(num);
    }
}
