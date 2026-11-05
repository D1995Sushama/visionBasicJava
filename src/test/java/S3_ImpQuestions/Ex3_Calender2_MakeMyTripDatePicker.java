package S3_ImpQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_Calender2_MakeMyTripDatePicker {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flights/");
        Thread.sleep(5000);

        // Close login popup
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        Thread.sleep(5000);

        // Click on departure field
        driver.findElement(By.xpath("//label[@for='departure']")).click();

        Thread.sleep(3000);

        String targetMonth = "February 2027";
        String targetDay = "2";

        // Loop until target month appears
        while(true)
        {
            String month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
            if (month.contains(targetMonth))
            {
                break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
            Thread.sleep(1000);
        }

        //click on target date
        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//p[text()='" +targetDay+ "'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='DayPicker-Week']//p[text()='"+targetDay+"'])[1]")).click();




        // Get all dates
//        List<WebElement> allDates = driver.findElements(By.xpath("//p[@class='dateInnerCell']"));
//
//        Thread.sleep(3000);
//
//        // Select target day
//        for (WebElement date : allDates)
//        {
//            System.out.println("target date found");
//            if (date.getText().equals(targetDay))
//            {
//                date.click();
//                break;
//            }
//            Thread.sleep(1000);
//        }
//
//        Thread.sleep(10000);

        // Close browser
      //  driver.quit();
    }
}