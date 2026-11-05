package WebDriverMethod;

import jdk.javadoc.doclet.Doclet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.lang.classfile.ClassFile;

public class Ex7_maximize {
    static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        //WebDriver.Options s1=driver.manage();
        //Window s2= s1.window();
       // s2.maximize();
        //WebDriver.Options s1 = driver.manage();
        //Window s2 = s1.window();
        //s2.maximize();

    }
}
