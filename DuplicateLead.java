package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup(); 
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("createContactForm_firstName")).sendKeys("Radhika");
		
		driver.findElement(By.id("createContactForm_lastName")).sendKeys("K V");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Radhika");
		
		driver.findElement(By.id("createContactForm_lasttNameLocal")).sendKeys("K V");
		
		driver.findElement(By.id("createContactForm_organization")).sendKeys("Infosys");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("QA Tester");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("radhikak06@gmail.com");
		
		WebElement source = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(source);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createContactForm_organization")).clear();
		
		driver.findElement(By.id("createContactForm_organization")).sendKeys("Oracle");
		
		driver.findElement(By.id("createContactForm_description")).clear();
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Lead");
		
	}

}
