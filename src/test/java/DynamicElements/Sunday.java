package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sunday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        Thread.sleep(2000);
        String Central = driver.findElement(By.xpath("(//app-statistics-card[@statstype='departments']//div)[5]//div")).getText();
        System.out.println(Central);
        Thread.sleep(2000);
        String State = driver.findElement(By.xpath("(//app-statistics-card[@statstype='departments']//div)[5]//div[2]")).getText();
        System.out.println(State);
    }
}
