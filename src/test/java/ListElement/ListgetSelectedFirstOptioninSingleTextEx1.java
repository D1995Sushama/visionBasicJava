package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListgetSelectedFirstOptioninSingleTextEx1 {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select s1=new Select(country);
        s1.selectByVisibleText("Canada");
        System.out.println("---------method 1-----------");
        WebElement s2=s1.getFirstSelectedOption();
        String text= s2.getText();
        System.out.println(text);
        System.out.println("---------method 2----------");
        String s3=s1.getFirstSelectedOption().getText();
        System.out.println(s3);
        System.out.println("------------method 3-----------");
        System.out.println(s1.getFirstSelectedOption().getText());


    }
}
