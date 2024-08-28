package Signup_signIn;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Check_required_format{

    WebDriver driver;

    @BeforeMethod
    public void openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\FoodFlow\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://thefoodflow.live");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click signup option
        driver.findElement(By.id("signup-btn")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void TC03_signupAsaSupplier() throws InterruptedException {
        // Signup as a supplier
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 2, dataProvider = "SignupData")
    public void validateRequiredFieldsAfterSupplierSignup(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword) throws InterruptedException {
        // Signup as a supplier
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();

        Thread.sleep(3000);

        validateRequiredFields(fullName, restaurantName, email, mobileNumber, password, confirmPassword);
    }

    @Test(priority = 3)
    public void TC04_signupAsaReceiver() throws InterruptedException {
        // Signup as a receiver
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 4, dataProvider = "SignupData")
    public void validateRequiredFieldsAfterReceiverSignup(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword) throws InterruptedException {
        // Signup as a receiver
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();

        Thread.sleep(3000);

        validateRequiredFields(fullName, restaurantName, email, mobileNumber, password, confirmPassword);
    }

    @DataProvider(name = "SignupData")
    public Object[][] signupData() {
        return new Object[][]{
            {"Foodcare", "Foodcare", "vijithakumari878@gmail", "0786756456", "Password123", "Password123ab"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "07867564", "Password123ab", "Password123ab"},
            {"Thefoodflow", "Foodcare", "", "0786756456", "Password123", "Password123", "emailError"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "0774345678", "Password", "Password123pa"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "0786756456", "password123ab", "Password123"},
            
        };
    }

    public void validateRequiredFields(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(fullName);
        driver.findElement(By.id("orgName")).sendKeys(restaurantName);
        driver.findElement(By.id("email")).sendKeys(email); 
        driver.findElement(By.id("mobileNumber")).sendKeys(mobileNumber);
        driver.findElement(By.id("passwordHash")).sendKeys(password);
        driver.findElement(By.id("Cpassword")).sendKeys(confirmPassword);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);

        
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



