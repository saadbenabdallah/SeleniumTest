package com.b2i;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver = new FirefoxDriver();
	
	public static void goTo(String url) {
		driver.get(url);
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
		
	}
}
