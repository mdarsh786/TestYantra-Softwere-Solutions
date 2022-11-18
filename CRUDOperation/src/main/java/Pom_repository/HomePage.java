 package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Lib.WebDriver_lib;

public class HomePage extends WebDriver_lib {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='Md Arshad']")
	private WebElement Arshadlink;
	
	@FindBy(xpath = "//a[@href='/account/?rd=0&link=home_account']")
	private WebElement proFile;
	
	public WebElement getProFile() {
		return proFile;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getArshadlink() {
		return Arshadlink;
	}
	
	public void navigateToArshad()
	{
		mouseOverOnElement(driver, Arshadlink);
		wiatForElement(driver,proFile );
		proFile.click();
	}
 
}
 