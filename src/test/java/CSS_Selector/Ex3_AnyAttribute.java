package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_AnyAttribute {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.cssSelector("[class='form-control']")).sendKeys("sushama");//[attribute='value']
        driver.findElement(By.cssSelector("*[class='form-control']")).sendKeys("sushama");//*[attribute='value']
      //  [Attribute1='vallu1'][Attribute2='value2']
        driver.findElement(By.cssSelector("[class='form-control'][id='email']")).sendKeys("dsushama76@gmail.com");//use for multiple same attribute
        //tagname[Attribute name^='prefics of value']
        driver.findElement(By.cssSelector("input[class^='form']")).sendKeys("sushama");//prefics contains element
        //tagname[Attribute na$='sufics of value']
        driver.findElement(By.cssSelector("input[class$='control']")).sendKeys();//suffics contains element

    }
}
