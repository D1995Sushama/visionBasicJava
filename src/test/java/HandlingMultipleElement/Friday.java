package HandlingMultipleElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Friday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int num = element.size();
        System.out.println(num);
        int num1 = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(num1);
        for(int i=0;i<= element.size()-1;i++){
            element.get(i).click();
        }
        Thread.sleep(2000);
        for(int j= element.size()-1;j>=0;j--){
            element.get(j).click();
        }

    }
}
