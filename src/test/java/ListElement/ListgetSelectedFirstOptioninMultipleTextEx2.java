package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListgetSelectedFirstOptioninMultipleTextEx2 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
        Select s1=new Select(colors);
        s1.selectByVisibleText("Red");
        s1.selectByValue("green");
        s1.selectByIndex(2);
        System.out.println("----------method 1-------------");
        WebElement result= s1.getFirstSelectedOption();
        String s=result.getText();
       System.out.println(s);
        System.out.println("----------method 2-----------------");
        String s2=s1.getFirstSelectedOption().getText();
        System.out.println(s2);
        System.out.println("-----------method 3-------------------");
        System.out.println(s1.getFirstSelectedOption().getText());

    }
}
