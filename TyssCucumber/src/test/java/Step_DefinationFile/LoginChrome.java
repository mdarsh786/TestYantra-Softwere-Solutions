package Step_DefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginChrome {

	WebDriver driver;
	String actTitle;

	@Given("launch the {string} browser")
	public void launch_the_browser(String browser) {

		if(browser.equalsIgnoreCase("chrome"))
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

	}

	@Given("Enter the {string}")
	public void enter_the(String url) {

		driver.get(url);

	}
	@When("Login page should be displayed enter Username {string} and Password {string}")
	public void login_page_should_be_displayed_enter_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
	}
	@When("Click on login button")
	public void click_on_login_button() {

		driver.findElement(By.id("submitButton")).click();
	}

	@Then("Home Page should be displayed")
	public void home_page_should_be_displayed() {

		actTitle = driver.getTitle();

	}
	@Then("Verify with the Homepage title")
	public void verify_with_the_homepage_title() {
		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM", actTitle);
		System.out.println("Verified");
		driver.close();

	}
}
