package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDeselectEx_4 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(country);
        s1.selectByIndex(3);
        s1.selectByVisibleText("Canada");
        s1.selectByValue("canada");
        Thread.sleep(2000);
        WebElement colour= driver.findElement(By.xpath("//select[@id='colors']"));
        Select s2=new Select(colour);
       s2.selectByIndex(0);
       s2.selectByValue("green");
       s2.selectByVisibleText("Blue");
       Thread.sleep(2000);
       s2.deselectByIndex(0);
       s2.deselectByVisibleText("Blue");
       s2.deselectByValue("green");

    }
}