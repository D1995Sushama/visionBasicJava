package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Thursday1test {
    static void main(String[] args) throws InterruptedException {
       loginwithinvalidcred();
        //loginwithvalidcred();

    }
   public static void loginwithvalidcred() throws InterruptedException {
       WebDriver driver = new EdgeDriver();
       driver.get("https://www.saucedemo.com/inventory.html");
       Thread.sleep(2000);
       Thursday1login log = new Thursday1login(driver);
       log.enterun("standard_user");
       log.enterpwd("secret_sauce");
       log.setkey();
       Thursday1home hm = new Thursday1home(driver);
       String actlogo = hm.setlogo();
       String expectlogo = "Swag Labs";
       if (actlogo.equals(expectlogo)) {
           System.out.println("TC Passed");
       } else {
           System.out.println("TC Faild");
       }
   }
        public static void loginwithinvalidcred() throws InterruptedException {
          WebDriver driver=new EdgeDriver();
          driver.get("https://www.saucedemo.com/");
          Thread.sleep(2000);
          Thursday1login log=new Thursday1login(driver);
          log.enterun("xyz");
          log.enterpwd("1234");
          log.setkey();
            String actmsg = log.errormsg();
            String expectedmsg="Username and password do not match";
            if(actmsg.contains(expectedmsg)){
                System.out.println("TC Passed");
            }
            else{
                System.out.println("TC Failed");
            }
       }

    }



