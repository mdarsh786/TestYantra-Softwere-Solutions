package Generic_Lib;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pom_repository.HomePage;
import Pom_repository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
File_lib plib=new File_lib();
WebDriver_lib wb=new WebDriver_lib();
	
	public WebDriver driver;
	@BeforeSuite
	public void bs()
	{
		System.out.println("DataBase connection");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Execute script in paarlle mode");
	}  
	
	@BeforeClass
	public void bc() throws Throwable
	{
		String browser = plib.getPropertyFile("browser");
		if(browser.equalsIgnoreCase("browser"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		
		}
	
		driver.manage().window().maximize();
		String url = plib.getPropertyFile("url");
		driver.get(url);
		
	}	
	@BeforeMethod
	public void beforemethod() throws Throwable
	{
		String usn = plib.getPropertyFile("username");
		String psw = plib.getPropertyFile("password");
		LoginPage logPage=new LoginPage(driver);
		logPage.LoginToapp(usn, psw);
	}
	
	@AfterMethod
//	public void aftermethod()
//	{
//	HomePage hm=new HomePage(driver);
//	hm.navigateToLogout();
//	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("parallel execution is completed");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Database connection removed");
	}

}
