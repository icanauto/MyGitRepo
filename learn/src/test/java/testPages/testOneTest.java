package testPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageObjects.DemoSignUpObjects;

public class testOneTest  {
	public  WebDriver driver;

	DemoSignUpObjects demObj;
	
	@BeforeTest
	public void setUp()
	{
		String typeDriver ="webdriver.chrome.driver";
		String path = "C:\\Users\\user\\eclipse-workspace\\AUTOIT\\learn\\Drivers\\chromedriver.exe";
	 System.setProperty(typeDriver,path);
		 driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100,milliseconds);
	}
  @Test
  public void fun2() throws IOException {
	  demObj = new DemoSignUpObjects(driver);
	  demObj.setFN("Marina");
	  System.out.println("inside mainTest fuc- testOneTest " );

  }
  
	/*
	 * @AfterTest public void cleanUp() { driver.quit(); }
	 */
}
