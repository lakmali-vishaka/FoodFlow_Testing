package contact_Us;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check_required_Fieleds {

	
	WebDriver driver;

    @BeforeTest
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://thefoodflow.live");
        driver.manage().window().maximize();

        Thread.sleep(3000);

;   
        	
        	
    }
    
    @BeforeMethod
    public void navigateToContactUsPage(){
    	//click add product
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contact Us']"))).click();
    }
    
    
    @Test
    public void TC_01A() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@placeholder='Enter your name'] ")).sendKeys("");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Email'] ")).sendKeys("v@gmail.com");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Organization'] ")).sendKeys("no");
    	WebElement messageTextarea = driver.findElement(By.xpath("//textarea[@placeholder='Enter your message']"));
    	messageTextarea.sendKeys("hi");
    	
    	
    	WebElement sendNowButton = driver.findElement(By.xpath("//font[@color='white' and text()='Send Now']"));
    	sendNowButton.click();

  
    	Thread.sleep(30000);
    	
}
    
    @Test
    public void TC_01B() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@placeholder='Enter your name'] ")).sendKeys("lakmali");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Email'] ")).sendKeys("");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Organization'] ")).sendKeys("no");
    	WebElement messageTextarea = driver.findElement(By.xpath("//textarea[@placeholder='Enter your message']"));
    	messageTextarea.sendKeys("hi");
    	
    	
    	WebElement sendNowButton = driver.findElement(By.xpath("//font[@color='white' and text()='Send Now']"));
    	sendNowButton.click();

  
    	Thread.sleep(30000);
    	
}
    @Test
    public void TC_01C() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@placeholder='Enter your name'] ")).sendKeys("Test");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Email'] ")).sendKeys("v@gmail.com");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Organization'] ")).sendKeys("");
    	WebElement messageTextarea = driver.findElement(By.xpath("//textarea[@placeholder='Enter your message']"));
    	messageTextarea.sendKeys("hi");
    	
    	
    	WebElement sendNowButton = driver.findElement(By.xpath("//font[@color='white' and text()='Send Now']"));
    	sendNowButton.click();

  
    	Thread.sleep(30000);
    	
}
    @Test
    public void TC_01D() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@placeholder='Enter your name'] ")).sendKeys("Test2");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Email'] ")).sendKeys("v@gmail.com");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Organization'] ")).sendKeys("no");
    	WebElement messageTextarea = driver.findElement(By.xpath("//textarea[@placeholder='']"));
    	messageTextarea.sendKeys("hi");
    	
    	
    	WebElement sendNowButton = driver.findElement(By.xpath("//font[@color='white' and text()='Send Now']"));
    	sendNowButton.click();

  
    	Thread.sleep(30000);
    	
}
    @Test
    public void TC_01E() throws InterruptedException {
    	driver.findElement(By.xpath("//input[@placeholder='Enter your name'] ")).sendKeys("Test2");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Email'] ")).sendKeys("v@gmail.com");
    	driver.findElement(By.xpath("//input[@placeholder='Enter your Organization'] ")).sendKeys("no");
    	WebElement messageTextarea = driver.findElement(By.xpath("//textarea[@placeholder='everything ok']"));
    	messageTextarea.sendKeys("hi");
    	
    	
    	WebElement sendNowButton = driver.findElement(By.xpath("//font[@color='white' and text()='Send Now']"));
    	sendNowButton.click();

  
    	Thread.sleep(30000);
}

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
}

