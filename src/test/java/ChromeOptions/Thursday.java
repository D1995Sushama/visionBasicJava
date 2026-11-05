package ChromeOptions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.rmi.RemoteException;

public class Thursday {
    static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();
        WebDriver driver=new ChromeDriver(opt);
      opt.addArguments("--start-maximized");
      opt.addArguments("--headless");
      opt.addArguments("--disable-notifications");
      opt.addArguments("--incognito");
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        System.out.println( cap.getBrowserName());
        System.out.println(cap.getBrowserVersion());

    }
    }

