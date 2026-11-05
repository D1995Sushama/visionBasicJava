package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class saturday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        List<WebElement> text = driver.findElements(By.xpath("//a"));
        for(WebElement link:text) {
            System.out.println(link.getText());
        }

        System.out.println(text.size());
    }
}
