package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Wednesday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title= driver.getTitle();
        System.out.println(title);
        driver.switchTo().frame(driver.findElement(By.cssSelector("#iframeResult")));
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menuButton")).click();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://autotestsandbox.com/examples/nested-iframes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.cssSelector("[title='Outer nested frame']")));
        Thread.sleep(2000);
        String outertext = driver.findElement(By.xpath("//p[text()='Outer iframe']")).getText();
        System.out.println(outertext);
        driver.switchTo().frame(driver.findElement(By.cssSelector("[title='Inner']")));
        Thread.sleep(2000);
        String innertext = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(innertext);


    }
}
