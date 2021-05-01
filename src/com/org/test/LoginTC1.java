package com.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.org.au.Dashboard;
import com.org.au.Homepage;
import com.org.au.Login;

public class LoginTC1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");

		Homepage home = new Homepage(driver);

		Login login = new Login(driver);

		Dashboard dashboard = new Dashboard(driver);

		home.clickLogin();

		login.enterUsername("---Your Username---");
		login.enterPassword("---Your Password---");

		login.clickLogin();
		Thread.sleep(3000);

		System.out.println("The page heading is --- " + dashboard.getHeading());

		dashboard.clickLogout();

		driver.quit();
	}

}
