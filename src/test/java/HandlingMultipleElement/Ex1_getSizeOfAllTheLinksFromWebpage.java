package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getSizeOfAllTheLinksFromWebpage {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> alllink = driver.findElements(By.xpath("//a"));
        int link = alllink.size();
        System.out.println(link);
        int link1 = driver.findElements(By.xpath("//a")).size();
        System.out.println(link1);
        System.out.println(driver.findElements(By.xpath("//a")).size());
        
    }
}
