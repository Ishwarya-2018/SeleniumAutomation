package com.org.au;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By uName = By.id("userName");

	By pswd = By.id("password");

	By loginBtn = By.id("login");

	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys("Aishwarya");
	}

	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys("Aish@123");
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
