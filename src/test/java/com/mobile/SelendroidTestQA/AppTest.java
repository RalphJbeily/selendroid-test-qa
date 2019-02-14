package com.mobile.SelendroidTestQA;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest 
{
   public static AppiumDriver<WebElement> driver;
   public static DesiredCapabilities cap;
   
   public static void Android_LaunchApp() throws MalformedURLException {
	   cap = new DesiredCapabilities();
	   cap.setCapability("platformName", "Android");
	   cap.setCapability("deviceName", "Nexus 5X API 28 x86");
	   cap.setCapability("appPackage", "io.selendroid.testapp");
	   cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
	   driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	   Assert.assertNotNull(driver);
   }
   
   public static void CloseApp() {
	   driver.quit();
   }
}
