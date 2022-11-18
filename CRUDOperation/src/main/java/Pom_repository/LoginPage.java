package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement usernametxt;
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement pwsdtxt;
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	private WebElement lgbtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsernametxt() {
		return usernametxt;
	}
	public WebElement getPwsdtxt() {
		return pwsdtxt;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	public void LoginToapp(String username,String password)
	{
		 usernametxt.sendKeys(username);
		 pwsdtxt.sendKeys(password);
		 lgbtn.click();
	}

}
