package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {
    static void main(String[] args) throws InterruptedException {
        org.openqa.selenium.WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String actTitle = driver.getTitle();
        String expTitle = "Google";
        System.out.println(actTitle);
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        if (actTitle.equals(expTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.navigate().to("https://www.instagram.com/");
        String actTitle1 = driver.getTitle();
        String expTitle1 = "Instagram";
        System.out.println(actTitle1);
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        if (actTitle1.equals(expTitle1)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();


    }
}