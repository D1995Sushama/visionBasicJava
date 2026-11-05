package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Thursdaytest {
    static void main(String[] args) {
        loginpagevalidcred();
        //loginpageinvalidcred();

    }
    public static void loginpagevalidcred(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thursdaylogin log=new Thursdaylogin(driver);
        log.enterun("standard_user");
        log.enterPWD("secret_sauce");
        log.enterkey();
        //driver.switchTo().alert().accept();
        Thursdayhome test= new Thursdayhome(driver);
        String actlogotext=test.veryfylogo();
        String expectedtext="Swag Labs";
        System.out.println(actlogotext);
        if(actlogotext.equals(expectedtext)){
            System.out.println("TC is pass");
        }
        else{
            System.out.println("TC is fail");
        }
    }
    public static void loginpageinvalidcred(){
     WebDriver driver=new EdgeDriver();
     driver.get("https://www.saucedemo.com/inventory.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     Thursdaylogin log=new Thursdaylogin(driver);
     log.enterun("xyz");
     log.enterPWD("12345");
     log.enterkey();
        String acttext = log.geterror();
        String expectedtext="Username and password do not match";
        if(acttext.contains(expectedtext)) {
         System.out.println("TC is pass");
        }
        else{
            System.out.println("TC is Fail");
        }


    }

}
