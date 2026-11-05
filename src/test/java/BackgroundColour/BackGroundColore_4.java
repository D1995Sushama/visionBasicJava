package BackgroundColour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.awt.*;
import java.time.Duration;

public class BackGroundColore_4 {
    public static void main(String[] args) {
        String expectedLogoBgColor = "#0866FF";//--fb-logo: #0866FF;/8, 102, 255, 1
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        WebElement logo = driver.findElement(By.xpath("//div[@class='x106a9eq']"));
        String actualRGBclrvalue= logo.getCssValue("background-color");
        System.out.println(actualRGBclrvalue);

          String actHexclr= Color.fromString(actualRGBclrvalue).asHex();
        System.out.println(actHexclr);
         if(expectedLogoBgColor.equals(actHexclr)){
            System.out.println("Blue color is matched");
        }
        else{
            System.out.println("Blue color is not matched");
        }
}
}
