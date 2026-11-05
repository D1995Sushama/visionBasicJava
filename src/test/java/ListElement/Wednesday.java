package ListElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wednesday {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(("https://testautomationpractice.blogspot.com/"));
        WebElement country = driver.findElement(By.cssSelector("#country"));
        Select s1=new Select(country);
        s1.selectByIndex(4);
        Thread.sleep(2000);
      s1.selectByValue("canada");
        Thread.sleep(2000);
       s1.selectByVisibleText("France");
       for(WebElement text1: s1.getOptions()){
           System.out.println(text1.getText());
       }
        System.out.println(s1.getFirstSelectedOption().getText());
        System.out.println(s1.getAllSelectedOptions().size());


        WebElement color = driver.findElement(By.cssSelector("#colors"));
       Select s2=new Select(color);
       s2.selectByValue("blue");
       Thread.sleep(2000);
       s2.selectByIndex(2);
       Thread.sleep(2000);
       s2.selectByVisibleText("Red");
       Thread.sleep(2000);
       s2.deselectByValue("blue");
       Thread.sleep(2000);
        System.out.println(s2.getFirstSelectedOption().getText());
        System.out.println(s2.getAllSelectedOptions().size());
        System.out.println("------------------------------");
        for(WebElement text: s2.getAllSelectedOptions()){
            System.out.println(text.getText());
        }
        System.out.println("---------------------------");
       s2.deselectByVisibleText("Red");
       Thread.sleep(2000);
       s2.deselectByIndex(2);
        boolean ct = s1.isMultiple();
        if(ct){
            System.out.println("Country Is MultipleSelected");
        }
        else{
            System.out.println("Country Is Not MultipleSelected");
        }
        System.out.println("-------------------------");
        boolean clr = s2.isMultiple();
        if(clr){
            System.out.println("Colors Is MultipleSelected");
        }
        else{
            System.out.println("Colors Is Not MultipleSelected");
        }


    }
}
