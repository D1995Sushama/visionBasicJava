package BackgroundColour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.Color;

public class BackGroundColourEx_2 {
    static void main(String[] args) throws InterruptedException {
        String expBackgroundColour="#f0f0f0ff";
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'_1psv1zeb9 _1o6mltlk4 _1psv1ze9x _1psv1ze7o _1psv1ze2u _1psv1ze53 _7dzyg23 _1psv1ze29')]"));
        String actbkclr=logo.getCssValue("background-color");
        System.out.println(actbkclr);
        String actHexclr= Color.fromString(actbkclr).asHex();
        System.out.println(actHexclr);
        if(expBackgroundColour.equals(actHexclr)){
            System.out.println("light gray color");
        }
        else{
            System.out.println("other color");
        }
    }
}
