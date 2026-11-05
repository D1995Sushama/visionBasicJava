package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_GetSpecificData_FromTable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.qafeast.com/");
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//a[text()='Tools']")).click();
        driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
        driver.findElement(By.xpath("(//ul[@class='lftside-lists']//li)[14]")).click();
        String text = driver.findElement(By.xpath("(//table[@role='grid']//tr)[4]//td[text()='New York']")).getText();
        System.out.println(text);
    }
}
