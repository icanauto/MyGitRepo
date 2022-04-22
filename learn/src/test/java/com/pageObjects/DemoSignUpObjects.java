package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSignUpObjects {

	public WebDriver driver;

	//By firstName = By.name("firstname");
	
//	By lastName = By.name("lastname");
//	By genderMal = By.xpath("//input[@type='radio' and @value='Male']");
//	By genderFem = By.xpath("//input[@type='radio' and @value='Female']");
	By yeofExp = By.xpath("//span[contains(text(),'Years of Experience')]");
	By countYearExp = By.xpath("//span[contains(text(),'Years of Experience')]/following-sibling::input");
	By exp4 = By.xpath("//span[contains(text(),'Years of Experience')]/following-sibling::input[@value=\"4\"]");
	By dateP = By.id("datepicker");
	By Prof = By.xpath("//span[contains(text(),'Profession')]");

    @FindBy(name="firstname")
    WebElement firstName;
    
    @FindBy(name="lastname")
    WebElement lastName;
    @FindBy(xpath="//input[@type='radio' and @value='Female']")
    WebElement genderfem;

	public DemoSignUpObjects(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);

	}

	public void setFN(String FN) {
		
		String firstName1 = FN;
		firstName.sendKeys(FN);
		lastName.sendKeys(FN);
		Boolean t= genderfem.isDisplayed();
		
		if(t)
		{
		genderfem.click();
		}
		else
		{ System.out.println("not SEEEn");
		}
		
		System.out.println("the fistname is --" + firstName1);

	}
}
