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

public class Check_required_fields {

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
    public void TC01_signupAsaSupplier() throws InterruptedException {
        // Signup as a supplier
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 2, dataProvider = "SignupData")
    public void validateRequiredFieldsAfterSupplierSignup(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword, String expectedErrorId) throws InterruptedException {
        // Signup as a supplier
        driver.findElement(By.xpath("//h3[text()='As a supplier']/parent::div/parent::a")).click();

        Thread.sleep(3000);

        validateRequiredFields(fullName, restaurantName, email, mobileNumber, password, confirmPassword, expectedErrorId);
    }

    @Test(priority = 3)
    public void TC02_signupAsaReceiver() throws InterruptedException {
        // Signup as a receiver
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 4, dataProvider = "SignupData")
    public void validateRequiredFieldsAfterReceiverSignup(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword, String expectedErrorId) throws InterruptedException {
        // Signup as a receiver
        driver.findElement(By.xpath("//h3[text()='As a receiver']/parent::div/parent::a")).click();

        Thread.sleep(3000);

        validateRequiredFields(fullName, restaurantName, email, mobileNumber, password, confirmPassword, expectedErrorId);
    }

    @DataProvider(name = "SignupData")
    public Object[][] signupData() {
        return new Object[][]{
            {"", "Foodcare", "vijithakumari878@gmail.com", "0786756456", "Password123", "Password123", "fullNameError"},
            {"Thefoodflow", "", "vijithakumari878@gmail.com", "0786756456", "Password123", "Password123", "restaurantNameError"},
            {"Thefoodflow", "Foodcare", "", "0786756456", "Password123", "Password123", "emailError"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "", "Password123pa", "Password123pa", "mobileNumberError"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "0786756456", "", "Password123pa", "passwordError"},
            {"Thefoodflow", "Foodcare", "vijithakumari878@gmail.com", "0786756456", "Password123pa", "", "confirmPasswordError"},
        };
    }

    public void validateRequiredFields(String fullName, String restaurantName, String email, String mobileNumber, String password, String confirmPassword, String expectedErrorId) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(fullName);
        driver.findElement(By.id("orgName")).sendKeys(restaurantName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("mobileNumber")).sendKeys(mobileNumber);
        driver.findElement(By.id("passwordHash")).sendKeys(password);
        driver.findElement(By.id("Cpassword")).sendKeys(confirmPassword);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.id(expectedErrorId));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed as expected");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

