package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Arrays;

public class BaseDriver {

    /**
     * Interview Sorusu
     * Singleton driver nedir?
     * Bütün projede aynı ve tek bir driverın kullanılmasıdır.
     */

    // Her thread e özel driver olacak ve static olduğu için o thread deki bütün classlaar aynı DRİVER ı kullanmış olacak.
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();  // WebDriver1  , WebDriver 2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // chrome , firefox

    public static WebDriver getDriver() {

        // XML den gelmeyen tarayıcı adı ile çalışan scenario lar için
        // default setleme yapıldı
        if (threadBrowserName.get() == null)
        {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) { //bu hatta driver var mı ?

            // yoksa hangi türü isteniyor ise o setleniyor
            switch (threadBrowserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();

                    options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
                    options.addArguments("force-device-scale-factor=0.75");
                    options.addArguments("high-dpi-support=0.75");
                    options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400"); //width, height

                    threadDriver.set( new ChromeDriver(options) );
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set( new FirefoxDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions option=new EdgeOptions();
                    option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
                    option.addArguments("force-device-scale-factor=1");
                    option.addArguments("high-dpi-support=1");
                    threadDriver.set( new EdgeDriver(option));
                    break;
            }
        }

        return threadDriver.get();
    }

    public static void DriverQuit() {
          Parent.wait(5);

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver =null;
            threadDriver.set(driver);
        }
    }
}
