package Navigation_Bar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check_buttons {

	WebDriver driver;

    @BeforeTest 
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://thefoodflow.live");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        
    }

    @Test
    
    public void TC_01_Home() {

        // Click login option
        driver.findElement(By.xpath("//a[text()='Home']")).click();
    }
    
@Test
    
    public void TC_02_About() {

        // Click login option
        driver.findElement(By.xpath("//a[text()='About Us']")).click();
    }


@Test

public void TC_01Home() {

    // Click login option
    driver.findElement(By.xpath("//a[text()='Shop']")).click();
}

@Test

public void TC_03_Shop() {

    // Click login option
    driver.findElement(By.xpath("//a[text()='Shop']")).click();
}

@Test

public void TC_04_Blog() {

    // Click login option
    driver.findElement(By.xpath("//a[text()='Blog']")).click();
}
public void TC_05_Contact() {

    // Click login option
    driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
}
public void TC_06_Signup() {

    // Click login option
    driver.findElement(By.xpath("signup-btn")).click();
    
}
public void TC_07_Login() {

    // Click login option
    driver.findElement(By.id("login-btn")).click();
}
    
	
}
