package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
     
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.xpath("//a[text()='Find Leads']")).click();       
         driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Brinny");
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
           
         driver.findElement(By.linkText("10745")).click();
         System.out.println("The title is:"+ driver.getTitle());
         driver.findElement(By.xpath("//a[text()='Edit']")).click();
         driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
         driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("HCL");
         driver.findElement(By.xpath("//input[@value='Update']")).click();
         driver.close();
 
         
         
        		 
         
	}

}

//*http://leaftaps.com/opentaps/control/main

//* 1	Launch the browser
//* 2	Enter the username
//* 3	Enter the password
//* 4	Click Login
//* 5	Click crm/sfa link
//* 6	Click Leads link
//* 7	Click Find leads
//* 8	Enter first name
//* 9	Click Find leads button
//* 10 Click on first resulting lead
//* 11 Verify title of the page
//* 12 Click Edit
//* 13 Change the company name
//* 14 Click Update
//* 15 Confirm the changed name appears
//* 16 Close do not logout