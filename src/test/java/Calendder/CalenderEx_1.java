package Calendder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderEx_1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
       Thread.sleep(2000);
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select y=new Select(year);
        y.selectByVisibleText("2028");
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select m=new Select(month);
        m.selectByVisibleText("February");
        Thread.sleep(2000);
        int day=20;
       driver.findElement(By.xpath("//div[text()='"+day+"']")).click();
       Thread.sleep(2000);
      // driver.quit();
    }
}
