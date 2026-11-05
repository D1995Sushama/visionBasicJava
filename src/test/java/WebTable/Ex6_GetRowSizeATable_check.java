package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex6_GetRowSizeATable_check {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaautomationlabs.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='menu-item-6577']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Testing Playground']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='nav-link '])[5]")).click();
        Thread.sleep(2000);
        List<WebElement> Rownum = driver.findElements(By.xpath("//table[@id='dataTable']"));
        int num = Rownum.size();
        System.out.println(num);
        int Rownum1 = driver.findElements(By.xpath("//table[@id='dataTable']")).size();
        System.out.println(Rownum1);
        System.out.println(driver.findElements(By.xpath("//table[@id='dataTable']")).size());
    }
}
