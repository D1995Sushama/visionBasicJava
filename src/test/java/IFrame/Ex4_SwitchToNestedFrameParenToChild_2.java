package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_SwitchToNestedFrameParenToChild_2 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));
        String text = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(text);
    }
}
