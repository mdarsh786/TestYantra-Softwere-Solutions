package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnSell {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		//driver.findElement(By.xpath("//*[name()='svg' and @class='_3V9PS']")).click();
		driver.findElement(By.xpath("//div[@class='DrSmZ']")).click();
		driver.findElement(By.xpath("//span[@class='_2AWwB _3Ln6T']")).click();
	}

}
