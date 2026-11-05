package Calendder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3_MakeMyTripDatePicker {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/flights/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        Thread.sleep(2000);
        String targetmonth="August 2027";
        String day ="14";
        while(true){
            String month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
            if(month.contains(targetmonth)){
                break;
            }
            else{
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
            Thread.sleep(2000);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='DayPicker-Day']//p[text()='" + day + "'])[1]")).click();

    }
}
