package com.b2i;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage{

	@FindBy(how = How.CSS, using = "div.large-7:nth-child(1) > h1:nth-child(2)")
	WebElement pageElement;
	
	
	@Override
	public void goTo() {
		Browser.driver.findElement(By.xpath("/html/body/div[2]/div/a[1]")).click();
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[104]/a/div/div[2]")).click();
	}

	@Override
	public String pathName() {
		return pageElement.getText();
	}

}
