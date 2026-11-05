package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://sauce-demo.myshopify.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='customer_login_link']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deshmukhsushama80@gmail.com");
        String result=driver.findElement(By.xpath("//input[@type='email']")).getAttribute("type");
        System.out.println(result);
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("181295");
       String result2=driver.findElement(By.xpath("//input[@type='password']")).getAttribute("type");
        System.out.println(result2);
        System.out.println("----------Enable--------------");
        //driver.findElement(By.xpath("//input[@value='Sign In']")).click();
        boolean s2=false;
        try {
            s2= driver.findElement(By.xpath("//input[@class='button']")).isEnabled();
        }
        catch (NoSuchElementException e){
            System.out.println("Exception Handeled");
        }
        System.out.println(s2);
        if(s2){
            System.out.println("Enable");
        }
        else{
            System.out.println("Disable");
        }
        System.out.println("-----Display------------");

        boolean s1=false;
        try {
            s1 = driver.findElement(By.xpath("//h1[text()='Customer Login']")).isDisplayed();
        }
        catch(NoSuchElementException e){
            System.out.println("Exception Handeled");
        }
        System.out.println("hi");
        System.out.println(s1);
        if(s1){
            System.out.println("Element Is Present");
        }
        else {
            System.out.println("Element Is Not Present");
        }


    }
}
