package BackgroundColour;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

import static org.openqa.selenium.support.Color.fromString;

public class BackGroundclrEx_1 {
    static void main(String[] args) throws InterruptedException {
        String expYellowClrHexValue="#ffe51f";
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'1psv1zeb9 _1psv1ze0 _1psv1ze9x _1psv1ze7o _1psv1ze2u _1psv1ze53 _7dzyg2x _1psv1ze29 _1psv1ze53')]"));
        String actbkclr = logo.getCssValue("background-color");
        System.out.println(actbkclr);

        String acthexclr=fromString(actbkclr).asHex();
        System.out.println(acthexclr);


        if(expYellowClrHexValue.equals(acthexclr)){
            System.out.println("yellow color");

        }
        else{
            System.out.println("other color");
        }
    }
}