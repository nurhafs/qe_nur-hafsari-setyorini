package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriversInit {
    public static AndroidDriver<AndroidElement> driver;

    public static void initialization() {
        DesiredCapabilities desc = new DesiredCapabilities();
        desc.setCapability("platformVersion", "11");
        desc.setCapability("platformName", "Android");
        desc.setCapability("automationName", "UiAutomator2");
        desc.setCapability("app", "C:\\Users\\ASUS\\Desktop\\stupen\\repo\\26_Mobile Testing\\Praktikum\\sample-mobile-automation\\src\\test\\resources\\application\\com.yoesuv.androidroom-v2(2.1.0)-release.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), desc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        driver.quit();
    }


}
