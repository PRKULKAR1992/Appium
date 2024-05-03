package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ObjectManager {
    AndroidDriver driver;
    BaseClass baseClass;
    public AndroidDriver GetAndroidDriver() throws MalformedURLException, InterruptedException {
        if(driver==null){
            baseClass=new BaseClass();
            driver=new AndroidDriver(new URL("http://172.16.20.163:4723"),baseClass.Configuratuion());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            return driver;
        }else {
            return driver;
        }
    }
}
