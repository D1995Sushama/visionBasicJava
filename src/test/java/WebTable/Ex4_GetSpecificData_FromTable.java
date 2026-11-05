package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_GetSpecificData_FromTable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement text = driver.findElement(By.xpath("(//table[@id='productTable']//tr)//td[text()='Wireless Earbuds']"));
        String text1 = text.getText();
        System.out.println(text1);
        String text2 = driver.findElement(By.xpath("(//table[@id='productTable']//tr)//td[text()='Wireless Earbuds']")).getText();
        System.out.println(text2);

    }
}
