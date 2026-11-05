package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Sunday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
        Thread.sleep(2000);
        WebElement option = driver.findElement(By.xpath("//option[text()='Please select an option']"));
        Select s1=new Select(option);
        s1.selectByValue("Option 1");
        Thread.sleep(2000);
        s1.selectByIndex(1);
        Thread.sleep(2000);
        s1.selectByVisibleText("Option 1");
        List<WebElement> text = s1.getOptions();
        for(WebElement s3:text){
            System.out.println(s3.getText());
        }
    }
}
