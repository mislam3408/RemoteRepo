package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverRidingPractice extends OverLoadingPrectice{

	//Override happens between Parent/super and child class
	// when we override any method from super class we can only change the body
	// parameter, access modifier and return type cant be different 
	// known as runtime polymorphism
	
	// tell me a real time example where you have used overriding
	
	
	@Override
	void click (By by) {
		
		dr.findElement(by).click();
		
	}
	@Override
	void click (WebElement ele) {
		
		ele.click();
		
	
	}
	
}
