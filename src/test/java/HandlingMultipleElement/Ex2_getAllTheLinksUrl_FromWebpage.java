package HandlingMultipleElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_getAllTheLinksUrl_FromWebpage {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> alllink = driver.findElements(By.xpath("//a"));
        for(WebElement link:alllink){
             String text = link.getAttribute("href");
            System.out.println(text);
        }
        System.out.println(alllink.size());
    }
}
