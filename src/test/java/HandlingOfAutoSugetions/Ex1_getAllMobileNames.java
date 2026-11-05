package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getAllMobileNames {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(2000);
        List<WebElement> mobile = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        for(WebElement list:mobile){

            System.out.println(list.getText());
        }

    }
}
