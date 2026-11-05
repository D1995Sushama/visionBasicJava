package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_selectSpecificMobileFromAutosugetion {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(2000);
        List<WebElement> allmobile = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        String expText= "redmi 17";
        for(WebElement actmobile:allmobile){
            String result = actmobile.getText();
            if(result.equals(expText)){
                actmobile.click();
                break;
            }
        }


    }
}
