package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Thursday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        List<WebElement> link = driver.findElements(By.xpath("//a"));
        for(WebElement alllink:link){
            System.out.println(alllink.getText());
            System.out.println(alllink.getAttribute("href"));

        }
        System.out.println(link.size());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement box:check)   {
            box.click();
        }
    }
}
