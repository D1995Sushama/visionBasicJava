package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Ex1_getAllTheLinksFromWebpage {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> alllink = driver.findElements(By.xpath("//a"));
       for(WebElement link:alllink){
           String text = link.getText();
           System.out.println(text);

       }
        System.out.println(alllink.size());

    }
}
