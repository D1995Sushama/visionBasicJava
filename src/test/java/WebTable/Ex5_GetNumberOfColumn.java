package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex5_GetNumberOfColumn {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.qafeast.com/");
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//a[text()='Tools']")).click();
        driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
        driver.findElement(By.xpath("(//ul[@class='lftside-lists']//li)[14]")).click();
        List<WebElement> columnnum = driver.findElements(By.xpath("//table[@role='grid']//th"));
        int num1 = columnnum.size();
        System.out.println(num1);
        int num2 = driver.findElements(By.xpath("//table[@role='grid']//th")).size();
        System.out.println(num2);
        System.out.println(driver.findElements(By.xpath("//table[@role='grid']//th")).size());
    }
}
