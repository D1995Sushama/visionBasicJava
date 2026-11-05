package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetSpecificData_FromTable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String text = driver.findElement(By.xpath("(//table[@name='BookTable']//tr)[5]/td")).getText();
        System.out.println(text);
        String text2 = driver.findElement(By.xpath("(//table[@name='BookTable']//tr)[5]")).getText();
        System.out.println(text2);
    }
}
