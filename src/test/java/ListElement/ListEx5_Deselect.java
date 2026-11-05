package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListEx5_Deselect {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(country);
        s1.selectByVisibleText("Germany");
        Thread.sleep(2000);
        s1.selectByIndex(3);
        Thread.sleep(2000);
        s1.selectByValue("china");
        Thread.sleep(2000);
       // s1.deselectAll();
        WebElement colour= driver.findElement(By.xpath("//select[@id='colors']"));
       Select s2=new Select(colour);
       s2.selectByIndex(4);
       s2.selectByIndex(0);
       s2.selectByIndex(2);
       Thread.sleep(1000);
       s2.deselectAll();

    }
}
