package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Tuesday1ChildBrowserPopup {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links");
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(2000);
        Set<String> allpage = driver.getWindowHandles();
       ArrayList<String> ar = new ArrayList(allpage);
//       String childid=ar.get(1);
//        System.out.println("child="+childid);
//        String  mainpageid=ar.get(0);
//        System.out.println("mainid="+mainpageid);

       driver.switchTo().window(ar.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Training']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(ar.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

        //Set<String> text = driver.getWindowHandles();
       // System.out.println(text.size());
        driver.quit();

    }
}
