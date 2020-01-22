package com.Test.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void initialization() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

	public void failed() {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(
					"C:\\Users\\schakrab\\eclipse-workspace\\TakeScreenShot\\src\\test\\java\\ScreenShot\\testFail.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}