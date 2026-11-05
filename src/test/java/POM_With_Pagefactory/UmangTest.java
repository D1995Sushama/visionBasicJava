package POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class UmangTest {
    static void main(String[] args) throws InterruptedException {
        //loginpagevalidcredentials();
        loginpageinvalidcredentials();

    }
    public static void loginpagevalidcredentials() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://web.umang.gov.in/");
        driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
        Thread.sleep(2000);
        UmangLoginpage umang=new UmangLoginpage(driver);
        umang.userid("9607718328");
        umang.pass("140895");
        umang.log();
        UmangHomePage home = new UmangHomePage(driver);
        String acttext = home.text1();
        String exptext = "Know Your DigiPin";
        if (acttext.equals(exptext)) {

            System.out.println("TC PASS");
        } else {
            System.out.println("TC FAIL");
        }
    }
        public static void loginpageinvalidcredentials() throws InterruptedException {
         WebDriver driver=new EdgeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://web.umang.gov.in/");
         driver.findElement(By.xpath("//button[@title='Login/Register']")).click();
         UmangLoginpage umg=new UmangLoginpage(driver);
         Thread.sleep(2000);
         umg.userid("9607718328");
         umg.pass("123456");
         umg.log();
         String actmsg=umg.error();
         String expmsg="Please provide a valid MPIN to proceed";
            System.out.println(actmsg);
            if(actmsg.contains(expmsg)){
                System.out.println("TC PASS");
            }
            else{
                System.out.println("TC FAIL");
            }


        }

    }

