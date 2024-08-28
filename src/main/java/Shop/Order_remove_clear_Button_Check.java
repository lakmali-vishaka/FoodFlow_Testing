package Shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Order_remove_clear_Button_Check {
	
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
    public void navigateToContactUsPage() {
        // Click add product
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Shop']"))).click();
    }

    
	//click order now
	
    @Test
    public void TC_01() throws InterruptedException {
    	WebElement orderNowButton = driver.findElement(By.xpath("//button[contains(@class, 'add-to-cart') and text()='Order Now']"));
    	orderNowButton.click();
    }
    
    //click remove button

}
