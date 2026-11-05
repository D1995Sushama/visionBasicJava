package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FridayTest1 {
    static void main(String[] args) {
//loginwithvalidcred();
loginwithinvalidcred();
    }
    public static void loginwithvalidcred() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Fridaylogin1 log=new Fridaylogin1(driver);
        log.enterun("standard_user");
        log.enterpwd("secret_sauce");
        log.clicklogin();
        Fridayhhomepage1 home=new Fridayhhomepage1(driver);
        String actlog=home.getlogotxt();
        String expectlogo="Swag Labs";
        if (actlog.equals(expectlogo)) {
            System.out.println("TC Pass");
        }
        else{
            System.out.println("Tc Fail");
        }
    }
    public static void loginwithinvalidcred(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Fridaylogin1 log=new Fridaylogin1(driver);
        log.enterun("xyz");
        log.enterpwd("1234");
        log.clicklogin();
      String actmsg=log.geterrormsg();
      String expectmsg="Username and password do not match";
      if(actmsg.contains(expectmsg)){
          System.out.println("Tc Pass");
      }
      else{
          System.out.println("Tc Fail");
      }
    }
}
