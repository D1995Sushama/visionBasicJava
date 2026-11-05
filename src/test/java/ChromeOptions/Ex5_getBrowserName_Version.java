package ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex5_getBrowserName_Version {
    static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        System.out.println(driver.getCapabilities().getBrowserName());
        System.out.println(driver.getCapabilities().getBrowserVersion());
    }
}
