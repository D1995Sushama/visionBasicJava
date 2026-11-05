package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Ex1Singleoption {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country =driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(country);
        //s1.selectByIndex(7);
       // s1.selectByValue("india");
        s1.selectByVisibleText("japan");
    }
}
