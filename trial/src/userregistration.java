import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userregistration {

    public static void main(String[] args) {
        // Setup the path
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ranji\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // amazon website
        driver.get("https://www.amazon.com/");

        // "Hello, Sign in" button
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signInButton.click();

        // Creating account
        WebElement createAccountButton = driver.findElement(By.id("createAccountSubmit"));
        createAccountButton.click();

        // Fill out the registration form
        WebElement nameField = driver.findElement(By.id("ap_customer_name"));
        nameField.sendKeys("Project E");

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("welcomeproject23@gmail.com");

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("Welcome@2023");

        WebElement confirmPasswordField = driver.findElement(By.id("ap_password_check"));
        confirmPasswordField.sendKeys("Welcome@2023");

        // Click on "Create your Amazon account" button
        WebElement submitButton = driver.findElement(By.id("continue"));
        submitButton.click();

        // redirecting to the homme page
        String expectedTitle = "Amazon.com";
        while (!driver.getTitle().contains(expectedTitle)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();
    }
}