package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monday {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String actTitle=driver.getTitle();
        String expTitle="Google";
        System.out.println(actTitle);
       String url= driver.getCurrentUrl();
        System.out.println(url);
        if(actTitle.equals(expTitle)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        String actTitle1=driver.getTitle();
        String expTitle1="Facebook";
        System.out.println(actTitle1);
        String url1=driver.getCurrentUrl();
        System.out.println(url1);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        if(actTitle1.equals(expTitle1)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();




    }
}
