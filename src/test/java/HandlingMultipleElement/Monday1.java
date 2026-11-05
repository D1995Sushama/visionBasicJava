package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Monday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement box:checkbox){
            box.click();
        }
        Thread.sleep(2000);
        int box1 = checkbox.size();
        System.out.println(box1);
        for(int i=box1-1;i>=0;i--){
            checkbox.get(i).click();
        }
    }
}
