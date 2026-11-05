package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_GetSpecificData_FromTable {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath("((//table[@name='BookTable'])//tr)[2]//td"));
        System.out.println(text.getText());
        Thread.sleep(2000);
        WebElement text1 = driver.findElement(By.xpath("(((//table[@name='BookTable'])//tr)[2]//td)[2]"));
        System.out.println(text1.getText());
        System.out.println("-------------------------");
        String text3 = driver.findElement(By.xpath("((//table[@name='BookTable'])//tr)[2]//td")).getText();
        System.out.println(text3);
        String text2 = driver.findElement(By.xpath("(((//table[@name='BookTable'])//tr)[2]//td)[2]")).getText();
        System.out.println(text2);
    }
}
