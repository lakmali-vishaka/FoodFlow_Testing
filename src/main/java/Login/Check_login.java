package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check_login {
	
	WebDriver driver;
 
    @BeforeMethod
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://thefoodflow.live");
        driver.manage().window().maximize();

        // Click login option
        driver.findElement(By.xpath("//a[@class='navbar-login']")).click();
        
        // login as a receiver
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();
        
       Thread.sleep(3000);
    }
    
    @Test
    public void TC11() {
    	driver.findElement(By.id("email")).sendKeys("Store@gmail.com");
    	driver.findElement(By.id("passwordHash")).sendKeys("123");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    
    @Test
    public void TC12() {
    	driver.findElement(By.id("email")).sendKeys("SStore@gmail.com");
    	driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@");
    	driver.findElement(By.xpath("//input[@type='submit']")).click(); 
    }

    @Test
    public void TC13() {
    	driver.findElement(By.id("email")).sendKeys("SStore@gmail.com");
    	driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@@@");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test
    public void TC14() {
    	driver.findElement(By.id("email")).sendKeys("Store@gmail.com");
    	driver.findElement(By.id("passwordHash")).sendKeys("Lakmali999@");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
