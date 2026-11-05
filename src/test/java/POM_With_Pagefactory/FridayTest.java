package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FridayTest {
    static void main(String[] args) throws InterruptedException {
        //loginpagewithvalidcred();
        loginwithinvalidcred();

    }
    public static void loginpagewithvalidcred() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Fridayloginswaglab login =new Fridayloginswaglab(driver);
        Thread.sleep(2000);
        login.enterun("standard_user");
        login.enterpwd("secret_sauce");
        login.clicklogin();
        FridayHomePageswag home=new FridayHomePageswag(driver);
        String actlogo=home.logotxt();
        String expectlogo="Swag Labs";
        if(actlogo.equals(expectlogo)){
            System.out.println("TC Pass");
        }
        else{
            System.out.println("TC Fail");
        }
    }
    public static void loginwithinvalidcred() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Fridayloginswaglab login=new Fridayloginswaglab(driver);
        Thread.sleep(2000);
        login.enterun("xyz");
        login.enterpwd("1234");
        login.clicklogin();
        String acterrormsg= login.geterrormsg();
        String expectmsg="Username and password do not match";
        if(acterrormsg.contains(expectmsg)){
            System.out.println("TC Pass");
        }
        else{
            System.out.println("TC Fail");
        }
    }
    }

