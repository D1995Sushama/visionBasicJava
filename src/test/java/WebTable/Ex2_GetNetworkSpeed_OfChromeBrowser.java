package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetNetworkSpeed_OfChromeBrowser {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String text = driver.findElement(By.xpath("//td[text()='Smartphone']//parent::tr/td[contains(text(),'$')]")).getText();
        System.out.println(text);
    }
}
