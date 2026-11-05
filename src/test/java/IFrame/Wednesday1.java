package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Wednesday1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.cssSelector("#iframeResult")));
        driver.findElement(By.xpath("//button[@type='button']")).click();
        String text = driver.findElement(By.xpath("//h1[text()='My First JavaScript']")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("#tryhome")).click();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://autotestsandbox.com/examples/nested-iframes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));
        String outertext = driver.findElement(By.xpath("//p[text()='Outer iframe']")).getText();
        System.out.println(outertext);
        driver.switchTo().frame(driver.findElement(By.cssSelector("[title='Inner']")));
        String innertext = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(innertext);
    }
}
