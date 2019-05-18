package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverLoadingPrectice {
	
	
	ChromeDriver dr;
	
	void click (By by) {
			
		dr.findElement(by).click();
		
	}
	
	void click (WebElement ele) {
		
		ele.click();
		
	}
	
	void click (String xpathValue) {
		
		dr.findElement(By.xpath(xpathValue)).click();
	
	}
	
	void seleniumExample () {
		
		dr.switchTo().frame(1);
		dr.switchTo().frame("dfsdaf");
		dr.switchTo().frame(dr.findElement(By.id("")));
		
	}
	
	
	
	
	
	

}
