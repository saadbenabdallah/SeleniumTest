package com.b2i;

import org.openqa.selenium.By;

public class PathPages {

	static String url = "https://app.pluralsight.com/paths";
	static String title = "Java | Pluralsight";

	public void goTo() {
		Browser.goTo(url);
	}

	public void goToJavaPath() {
		Browser.driver.findElement(By.linkText("Java")).click();
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
}
