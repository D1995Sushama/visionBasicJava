package HandlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tuesday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("[role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Cart']")).click();
        List<WebElement> link = driver.findElements(By.xpath("//a"));
        System.out.println("Total links in Cart:"+link.size());
        for(WebElement list:link){
            System.out.println(list.getText());
            System.out.println(list.getAttribute("href"));
        }
        Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("file:///C:/jsonAPI/cheackbox.html");
        List<WebElement> box = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement check:box){
            check.click();
        }
        Thread.sleep(2000);

       int a= box.size()-1;
        for(int i=a;i>=0;i--){
            box.get(i).click();
        }



    }
}
