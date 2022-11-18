package Step_DefinationFile;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganization {
	WebDriver driver;
	String orgName;
	@Given("As a launch a browser")
	public void as_a_launch_a_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	
	@Given("I will enter the url")
	public void i_will_enter_the_url() {
		
		driver.get("http://localhost:8888");
		
	}

	@Given("In login page I will enter username {string} and password {string} and click on login button")
	public void in_login_page_i_will_enter_username_and_password_and_click_on_login_button(String user, String pwd) {
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(pwd, Keys.ENTER);
	    
	}

	@When("In homepag click on organizations link")
	public void in_homepag_click_on_organizations_link() {
	    
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}

	@When("In organization page click on new org image")
	public void in_organization_page_click_on_new_org_image() {
	    
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	}

	@When("In create new org page enter mandatory fields click on save button")
	public void in_create_new_org_page_enter_mandatory_fields_click_on_save_button() {
		Random ran = new Random();
		int random = ran.nextInt(100);

		orgName = "TYSS"+ random;
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		//driver.findElement(By.id("email1")).sendKeys(eml);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    
	}

	@Then("Verify org created or not")
	public void verify_org_created_or_not() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actTxt = driver.findElement(By.xpath("//span[contains(.,'TYSS')]")).getText();
		Assert.assertTrue(actTxt.contains(orgName));
		driver.close();
	    
	}
	
	@Given("As user Launch a browser")
	public void as_user_launch_a_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("I will Enter url")
	public void i_will_enter_url() {
		
		driver.get("http://localhost:8888");
	}

	@Given("In Login page enter username {string} and password {string} and click on login button")
	public void in_login_page_enter_username_and_password_and_click_on_login_button(String username, String pswd) {
	    
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(pswd, Keys.ENTER);
	}

	@When("In Homepag click on organization link")
	public void in_homepag_click_on_organization_link() {
	    
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}

	@When("In Organizations page click on new org image")
	public void in_organizations_page_click_on_new_org_image() {
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	}

	@When("In create new org page enter {string} and {string} and click on save button")
	public void in_create_new_org_page_enter_and_and_click_on_save_button(String orgname, String eml) {
	    
		Random ran = new Random();
		int random = ran.nextInt(100);

		orgName =orgname+ random;
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.id("email1")).sendKeys(eml);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
	
	@Then("Verify org {string} is created or not properly") 
	public void verify_org_is_created_or_not_properly(String orgN) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actTxt = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(actTxt.contains(orgN));
		driver.close();
		
	}

}
