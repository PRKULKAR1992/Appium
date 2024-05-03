package Utilities;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;

public class BaseClass {
    AppiumDriverLocalService appiumServiceBuilder;
    public UiAutomator2Options Configuratuion() throws MalformedURLException {
        this.appiumServiceBuilder=new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\prathmesh.kulkarni\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("172.16.20.163").usingPort(4723).build();
        appiumServiceBuilder.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel_3a_API_33_x86_64");
        options.setApp("C:\\Users\\prathmesh.kulkarni\\Downloads\\AppiumFrameworkDesign\\AppiumFrameworkDesign\\src\\main\\APK Fils\\General-Store.apk");
        options.setCapability("newCommandTimeout","50000");
        //AndroidDriver driver=new AndroidDriver(new URL("http://172.16.20.163:4723"),options);
        return options;
    }

    public void TearDown(){
        appiumServiceBuilder.stop();
    }
}
