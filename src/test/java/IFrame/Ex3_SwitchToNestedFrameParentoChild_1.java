package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SwitchToNestedFrameParentoChild_1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));
        String text1 = driver.findElement(By.xpath("//p[text()='Outer iframe']")).getText();
        System.out.println(text1);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));
        String text2 = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(text2);
    }
}
