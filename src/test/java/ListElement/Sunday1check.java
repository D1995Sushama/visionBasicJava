package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sunday1check {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://web.umang.gov.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[text()=' Register Here']")).click();
        Thread.sleep(2000);
        WebElement state = driver.findElement(By.xpath("//mat-select[@aria-haspopup='listbox']"));
        Select s1=new Select(state);
        s1.selectByIndex(3);
        Thread.sleep(2000);
        s1.selectByValue("Assam");
        Thread.sleep(2000);
        s1.selectByVisibleText("Assam");
        Thread.sleep(2000);
    }
}
