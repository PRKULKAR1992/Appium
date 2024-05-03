package prathmesh;

import Utilities.ObjectManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class firstMobileTesting {
    AndroidDriver driver;
    ObjectManager objectManager;
    @Test
public void PlaceOrder() throws MalformedURLException, InterruptedException {

    this.objectManager=new ObjectManager();
    this.driver=objectManager.GetAndroidDriver();
    driver.findElement(AppiumBy.id("android:id/text1")).click();
    driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")).click();
//    Select dropdown = new Select(driver.findElement(AppiumBy.id("android:id/text1")));
//    dropdown.selectByVisibleText("Angola");
    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Prathmesh");
    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();



}


}
