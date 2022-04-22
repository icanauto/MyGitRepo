package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest {

	public  WebDriver driver;
	
	
	/*
	 * @BeforeTest public void setUp() { String typeDriver
	 * ="webdriver.chrome.driver"; String path =
	 * "C:\\Users\\user\\eclipse-workspace\\AUTOIT\\learn\\Drivers\\chromedriver.exe";
	 * System.setProperty(typeDriver,path); driver = new ChromeDriver();
	 * driver.get("https://rahulshettyacademy.com/AutomationPractice/"); }
	 * 
	 * @AfterTest public void cleanUp() { driver.quit(); }
	 */
}
