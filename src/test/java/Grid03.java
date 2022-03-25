import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

public class Grid03 {
    public static void main(String[] args) throws MalformedURLException {

        //selenıum 4 de calısıyrouz su anda
        // ancak selenıum 3 de bu ıslemler daha uzundu
        // asagıda selenıum 3 e uygun sekılde yaptıgımız kodlarımız var

        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setPlatform(Platform.WINDOWS);   // platform ismı tanımlalam lazım
        cap.setBrowserName("chrome");       // browser tanımalam lazımdı
        cap.setVersion("98.0.4758.102");     // versıyon tanımlalama gerektı

        //bundan sonrakı aynı gıbı selenıum 4 ıle
        ChromeOptions options=new ChromeOptions();

        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.102:4444"),options);

        System.out.println(driver.getCurrentUrl());
    }
}
