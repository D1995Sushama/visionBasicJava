package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_getSizeOfAllCheckboxes {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int s1 = allcheckbox.size();
        System.out.println(s1);
        int s2 = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(s2);
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
