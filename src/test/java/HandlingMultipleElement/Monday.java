package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Monday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> link = driver.findElements(By.xpath("(//div[contains(@class,'x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s')])[20]"));
        System.out.println(link.size());
        for(WebElement lang:link){
            System.out.println(lang.getText());
        }

        List<WebElement> link1 = driver.findElements(By.xpath("//a"));
        System.out.println(link1.size());
        for(WebElement links:link1){
            System.out.println(links.getText());
            System.out.println(links.getAttribute("href"));
        }

    }
}