package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_ClassAttribute {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("sushama");//tagname.classname
        driver.findElement(By.cssSelector("*.form-control")).sendKeys("sushama");//*.classname
        driver.findElement(By.cssSelector(".form-control")).sendKeys("sushama");//.classname

    }
}
