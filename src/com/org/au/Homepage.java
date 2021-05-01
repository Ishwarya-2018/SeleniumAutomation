package com.org.au;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for login button
	By LoginBtn = By.id("login");

	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
}
