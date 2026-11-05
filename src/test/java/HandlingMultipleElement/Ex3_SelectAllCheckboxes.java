package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_SelectAllCheckboxes {
    static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox:allcheckbox){
            checkbox.click();

        }
        //for(int i=0;i<= allcheckbox.size()-1;i++){
          //  allcheckbox.get(i).click();
        //}
    }
}
