package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_GetSpecificData_FromTable {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement text = driver.findElement(By.xpath("(//table[@id='taskTable']//tr)//td[text()='Firefox']"));
        String text1 = text.getText();
        System.out.println(text1);
    }

}
