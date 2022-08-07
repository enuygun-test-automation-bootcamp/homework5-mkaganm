package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {



        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "8.1.0");
        capabilities.setCapability("deviceName", "Pixel_4_API_27");
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("app", "C:\\Users\\mkaga\\IdeaProjects\\Bootcamp5\\src\\test\\resources\\apps\\ContactManager.apk");

        AppiumDriver Driver = new AndroidDriver(new URL("http://172.30.0.1:4723/wd/hub/"), capabilities);
    }
}