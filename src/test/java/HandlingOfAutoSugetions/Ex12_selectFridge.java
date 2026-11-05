package HandlingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex12_selectFridge {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("Fridge");
        Thread.sleep(2000);
        List<WebElement> fridge = driver.findElements(By.xpath("//ul[contains(@style,'border-radius:')]"));
        int no = fridge.size();
        System.out.println(no);
        String expected="fridge 2 door";
        for(WebElement actresult:fridge){
            if(actresult.equals(expected)){
                actresult.click();
            }
        }
        for(WebElement allfridge:fridge) {
            String text = allfridge.getText();
            System.out.println(text);

        }


        }
    }

