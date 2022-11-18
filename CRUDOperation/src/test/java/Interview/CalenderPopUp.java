package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']/ancestor::li[@class='menu_Flights']")).click();
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/ancestor::div[@class='datePickerContainer'][contains(.,'"+monyr+"')]")).getText();
		 String monyr = "October 2022";
		while (true) {
			try {
			WebElement ele = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/ancestor::div[@class='datePickerContainer'][contains(.,'"+monyr+"')]"));
			ele.getText();
			WebElement ele1 = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
			ele1.click();
			driver.findElement(By.xpath("//div[@class='DayPicker-Day']/ancestor::div[@class='DayPicker-Months']")).click();
			break;
			}
			catch (Exception e) {
				//driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			
			}
		}
	}

}
