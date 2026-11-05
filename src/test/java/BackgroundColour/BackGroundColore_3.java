package BackgroundColour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BackGroundColore_3 {
    public static void main(String[] args) {
        String expectedBackgroundColour = "#0a58ca";//#0d6ef
        WebDriver driver = new ChromeDriver();


            driver.get("https://web.umang.gov.in/landing/");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//button[@title='Login/Register'])[1]")));
            String buttonBackgroundColour = button.getCssValue("--bs-btn-active-bg");
            System.out.println(buttonBackgroundColour);

            String actualHexColour = Color.fromString(buttonBackgroundColour).asHex();
            System.out.println(actualHexColour);

            if (expectedBackgroundColour.equalsIgnoreCase(actualHexColour)) {
                System.out.println("Blue color is matched");
            } else {
                System.out.println("Blue color is not matched");
            }

           // driver.quit();

    }
}