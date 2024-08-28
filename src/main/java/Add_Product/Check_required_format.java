package Add_Product;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check_required_format {
	
	WebDriver driver;

    @BeforeTest
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://thefoodflow.live");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        // Click login option
        driver.findElement(By.xpath("//a[@class='navbar-login']")).click();
        
        // login as a receiver
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();
       
        	driver.findElement(By.id("email")).sendKeys("Store@gmail.com");
        	driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();   
        	
        	
    }
    
    @BeforeMethod
    public void navigateToAddProductPage(){
    	//click add product
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='AddProduct.html']/span[text()='Add Products']"))).click();
    }
    
    
    
    
    @Test
    public void TC_04A() throws InterruptedException {
    	driver.findElement(By.id("productName")).sendKeys("Pasta_noodles_897%^..");
    	driver.findElement(By.xpath("//option[@value='Kiribath']")).click();
    	driver.findElement(By.id("productPrice")).sendKeys("89");
    	driver.findElement(By.id("quantity")).sendKeys("5");
    
    	driver.findElement(By.id("submit-button")).click();   
    	Thread.sleep(30000);
    	
    	
    }
    
    @Test
    public void TC_04B() throws InterruptedException {
    	driver.findElement(By.id("productName")).sendKeys("kolakanda");
    	driver.findElement(By.xpath("//option[@value='Rice']")).click();
    	driver.findElement(By.id("productPrice")).sendKeys("100Y");
    	driver.findElement(By.id("quantity")).sendKeys("9");
    
    	driver.findElement(By.id("submit-button")).click(); 
    	Thread.sleep(30000);
    	
    	
    }
    
    //Adding product correctly

    @Test
    public void TC_04C() throws InterruptedException {
    	driver.findElement(By.id("productName")).sendKeys("chocolate_icecream");
    	driver.findElement(By.xpath("//option[@value='Hoppers']")).click();
    	driver.findElement(By.id("productPrice")).sendKeys("100");
    	driver.findElement(By.id("quantity")).sendKeys("A");
    
    	driver.findElement(By.id("submit-button")).click(); 
    	Thread.sleep(30000);
    	
    	
    }
    
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    

}
