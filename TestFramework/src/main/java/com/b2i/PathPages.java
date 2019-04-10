package com.b2i;

import org.openqa.selenium.By;

public class PathPages {

	static String url = "https://app.pluralsight.com/paths";
	static String title = "Java | Pluralsight";

	public void goTo() {
		Browser.goTo(url);
	}

	/*public void goToJavaPath() {
		Browser.driver.findElement(By.xpath("/html/body/div[2]/div/a[1]")).click();
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[2]/a/div/div[2]")).click();
	}*/

	public PathPage getPathPage(String page) {
		switch (page) {
		case "Java":
			return Pages.javaPathPage();
		}
		return null;
	}
	
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}
}
