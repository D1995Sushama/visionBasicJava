package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex5_SelectDeselectAllCheckboxes {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement box:checkbox){
            box.click();
        }
        Thread.sleep(2000);
        for(WebElement box1:checkbox){
            box1.click();
        }
    }
}
