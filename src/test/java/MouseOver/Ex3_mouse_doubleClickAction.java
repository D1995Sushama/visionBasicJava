package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_mouse_doubleClickAction {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement elem = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions s1=new Actions(driver);
        //Apr1
//        s1.moveToElement(elem).perform();
//        act.doubleClick().perform();

        //Apr2:
//        s1.moveToElement(elem).doubleClick().perform();

//        Apr3
        s1.doubleClick(elem).perform();
    }
}
