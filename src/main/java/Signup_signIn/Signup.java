package Signup_signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signup {

	 WebDriver driver;

	    @BeforeMethod
	    public void openUrl() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://thefoodflow.live");
	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	       
	    }

	
	@Test
	
	public void TC04_SignUp_Supplier() throws InterruptedException {
		
		 // Click signup option
        driver.findElement(By.id("signup-btn")).click();

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();
        
        Thread.sleep(3000);
        
		    driver.findElement(By.id("name")).sendKeys("Vishaka");
	        driver.findElement(By.id("orgName")).sendKeys("shop");
	        driver.findElement(By.id("email")).sendKeys("v@gmail.com"); 
	        driver.findElement(By.id("mobileNumber")).sendKeys("0786756789");
	        driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@");
	        driver.findElement(By.id("Cpassword")).sendKeys("Lakmali999@");

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(5000);

		
		
	}
	
	@Test
    public void TC05_SignUp_Reciever() throws InterruptedException {
		
		 // Click signup option
        driver.findElement(By.id("signup-btn")).click();

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("name")).sendKeys("VishakaLakmali");
        driver.findElement(By.id("orgName")).sendKeys("shop2");
        driver.findElement(By.id("email")).sendKeys("vl@gmail.com"); 
        driver.findElement(By.id("mobileNumber")).sendKeys("0786756788");
        driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@@");
        driver.findElement(By.id("Cpassword")).sendKeys("Lakmali999@@");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);

        
		
	}
}
