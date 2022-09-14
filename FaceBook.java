package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		
		
	    driver.findElement(By.name("firstname")).sendKeys("Arun");
	    
		 driver.findElement(By.name("lastname")).sendKeys("Brinny");
		 
		 driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9876543210");
		 
		driver.findElement(By.id("password_step_input")).sendKeys("@1Ksdfrghy");
		
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByVisibleText("19");
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Feb");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		year.selectByVisibleText("1998");
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        
        }
}
//Step 5:
//Add implicit wait
//Step 6: Click on Create New Account button driver.findElement(By.xpath("//div[@id='content']/div[1]/div[1]/div[1]")).click();
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enter the password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
        // ( A normal click will do for this step) 

