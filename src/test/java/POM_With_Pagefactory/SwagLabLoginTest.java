package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SwagLabLoginTest {
    static void main(String[] args) throws InterruptedException {
      // validloginCredential();
       invalidloginCredential();

    }

    public static void validloginCredential() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SwagLabLoginPage log = new SwagLabLoginPage(driver);
        Thread.sleep(2000);
        log.UserName("standard_user");
        log.Password("secret_sauce");
        log.login();
        SwagLabHomePage home = new SwagLabHomePage(driver);
        String actlogotext = home.getLogoText();
        String expectlogtext = "Swag Labs";
        if (actlogotext.equals(expectlogtext)) {
            System.out.println("TC PASS");
        } else {
            System.out.println("TC FAIL");
        }
    }
        public static void invalidloginCredential () {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            SwagLabLoginPage log1=new SwagLabLoginPage(driver);
            log1.UserName("xyz");
            log1.Password("12345");
            log1.login();
            String actloginfailmsg=log1.errorMsg();
            String expectloginfailmsg="Username and password do not match";
            if(actloginfailmsg.contains(expectloginfailmsg)){
                System.out.println("TC PASS");
            }
            else{
                System.out.println("TC FAIL");
            }

        }
    }
