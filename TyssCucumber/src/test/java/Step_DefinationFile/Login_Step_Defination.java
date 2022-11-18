package Step_DefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Step_Defination {
	WebDriver driver;
	String actTitle;
	String err;

	@Given("launch the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

	@Given("Enter the URL")
	public void enter_the_url() {
		driver.get("http://localhost:8888/");
	}

	@When("Login page should be display enter Username and Password")
	public void login_page_should_be_display_enter_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");

	}

	@When("click on login button")
	public void click_on_login_button() {

		driver.findElement(By.id("submitButton")).click();

	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {

		actTitle = driver.getTitle();

	}

	@Then("Verify with the homepage title")
	public void verify_with_the_homepage_title() {

		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM", actTitle);
		System.out.println("Verified");
		driver.close();
	}
	
	@When("Login page should be display enter Username {string} and Password {string}")
	public void login_page_should_be_display_enter_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		
		err = driver.findElement(By.className("errorMessage")).getText();
		System.out.println(err);
		    
		}
 
	@Then("Verify error message")
	public void verify_error_message() {
		    
		Assert.assertEquals("You must specify a valid username and password.", err);
		System.out.println("Verify");
		driver.close();
	}

}
