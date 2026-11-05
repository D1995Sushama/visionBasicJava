package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FridaygetSizeOfColumnsandRows {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("------------------Action ON Static Table---------------------------");
        System.out.println("----get size or text of row------ ");
        List<WebElement> count = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int row = count.size();
        for(WebElement text:count){
            String result = text.getText();
            System.out.println("row="+result+ "");
        }
        System.out.println("total row="+row);
        System.out.println("----get size or text of column------ ");
        List<WebElement> count1 = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        int columns = count1.size();
        for(WebElement text1:count1){
            String result=text1.getText();
            System.out.println("columns"+result);
        }
        System.out.println("total columns="+columns+"");
        System.out.println("----Specific Data-----");
        String name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[2]")).getText();
        System.out.println(name);
        System.out.println("------------------Action ON Dynamic Table---------------------------");
        System.out.println("----get size or text of column from Dinamic Table------ ");
        List<WebElement> row1 = driver.findElements(By.xpath("//tr[@id='headers']//th"));
        System.out.println("number of row="+row1.size());
        for(WebElement header:row1){
            System.out.println(header.getText());
        }
        System.out.println("------Data in Table-------");
        List<WebElement> row2 = driver.findElements(By.xpath("//table[@id='taskTable']//tr/td[3]"));
        for(WebElement text2:row2){
            System.out.println("Row data="+text2.getText());
        }
        System.out.println("--------dynamic data in Row-----------");
        List<WebElement> row4 = driver.findElements(By.xpath("//table[@id='taskTable']//tr[4]"));
        for(WebElement text:row4){
            System.out.println("Row data="+text.getText());
        }
        System.out.println("--------Stable data in Row-----------");
        List<WebElement> row5 = driver.findElements(By.xpath("//td[text()='System']//parent::tr"));
        for(WebElement text:row5){
            System.out.println("satable data in row="+text.getText());
        }
        System.out.println("---------Check Box Method 1--------------");
        driver.findElement(By.xpath("//table[@id='productTable']//tr[3]/td[4]/input[@type='checkbox']")).click();
        System.out.println("------------Check Box Method 2----------------");
        driver.findElement(By.xpath("//td[text()='Smartwatch']//parent::tr//td[4]/input[@type='checkbox']")).click();




    }
}