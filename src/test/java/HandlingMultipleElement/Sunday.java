package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sunday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        List<WebElement> link = driver.findElements(By.xpath("//a"));
        for(WebElement li:link){
            System.out.println(li.getAttribute("href"));
            System.out.println(li.getText());
        }
        int s = link.size();
        System.out.println(s);


    }
}
