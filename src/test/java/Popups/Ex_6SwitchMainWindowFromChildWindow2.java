package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex_6SwitchMainWindowFromChildWindow2 {
    static void main() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        //click on NewTab button from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        //get child window id
        Set<String> win = driver.getWindowHandles();
        ArrayList<String>s1=new ArrayList<>(win);
        //switch to child
        driver.switchTo().window(s1.get(1));
        //click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        //switch to main page
        driver.switchTo().window(s1.get(0));
        //click on NewWindow button from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> win2 = driver.getWindowHandles(); //[mainPage, childWindow1, childWindow2]
        ArrayList<String>s2=new ArrayList<>(win2);  //[mainPage[0], childWindow1[1], childWindow2[2]]
        //switch to child window2
        driver.switchTo().window(s2.get(2));
        driver.close();
    }
}
