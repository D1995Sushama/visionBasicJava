package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/landing/");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
        WebElement s1=driver.findElement(By.xpath("//input[@inputmode='numeric']"));
        s1.sendKeys("9607718328");
        Thread.sleep(2000);
        s1.clear();
        WebElement s2=driver.findElement(By.xpath("(//input[@inputmode='numeric'])[2]"));
        s2.sendKeys("150847");
        Thread.sleep(2000);
        s2.clear();
    }
}
