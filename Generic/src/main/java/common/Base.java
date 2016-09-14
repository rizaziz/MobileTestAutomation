package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Base {

    public static AppiumDriver ad = null;
    public DesiredCapabilities cap = null;
    public File appDirectory = null;
    public File findApp = null;
    public String platform=null;


    @Parameters({"OS", "deviceName", "version", "app"})
    @BeforeSuite
    public void setUp(@Optional("Android") String OS,
                      @Optional("Azizjon Rizayev (Galaxy Note4)") String deviceName,
                      @Optional("6.0") String version,
                      @Optional("converter.apk") String app)
            throws IOException,InterruptedException{

        if(OS.equalsIgnoreCase("ios")){
            appDirectory=new File("iOS/src/app");
            platform=MobilePlatform.IOS;

        } else if(OS.equalsIgnoreCase("Android")){
            appDirectory=new File("Android/src/app");
            platform=MobilePlatform.ANDROID;

        }

        findApp = new File(appDirectory,app);

        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());

        if(platform.equals(MobilePlatform.ANDROID)){
            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }else if(platform.equals(MobilePlatform.IOS)){
            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void cleanUpApp(){
        //ad.quit();
    }

}
