package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FacebookTest {
    static void main(String[] args) {
        loginwithvalidcredential();

    }
    public static void loginwithvalidcredential(){
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        FacebookWithoutPOM log=new FacebookWithoutPOM(driver);
        log.Userid("9607718328");
        log.Passwd("mymom@1995");
        log.login();
        log.ckrobo();
        log.ckr();
        String acttext = log.errormsg();
        String expetext="The password you've entered is incorrect.";
        if(acttext.contains(expetext)){
            System.out.println("TC PASS");
        }
        else{
            System.out.println("TC FAIL");
        }
    }
}
