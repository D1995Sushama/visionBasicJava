package S3_ImpQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_Calender1 {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://demoqa.com/date-picker");

        // Maximize window
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click on date field
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();

        Thread.sleep(3000);

        // Select year
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("2028");

        // Select month
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText("March");

        Thread.sleep(3000);

        // Select day
        int day = 15;

        driver.findElement(By.xpath("//div[text()='" + day + "']")).click();

        Thread.sleep(10000);

        // Close browser
        driver.quit();
    }
}