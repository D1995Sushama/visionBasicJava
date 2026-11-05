package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_GetNetworkSpeed_OfChromeBrowser {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String text = driver.findElement(By.xpath("//td[text()='Chrome']//parent::tr/td[contains(text(),'Mbps')]")).getText();
        System.out.println(text);
    }
}
