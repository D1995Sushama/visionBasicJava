package S3_ImpQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex6_JavaScriptExecutor1_clickOnElement
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement startButton = driver.findElement(By.xpath("//button[text()='START']"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", startButton);     //(action,webElement)
    }
}
