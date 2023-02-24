package  Advanced;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class completeproj {
    public static void main(String[] args) {
        //  ChromeDriver setup
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ranji\\Downloads\\chromedriver.exe");

        // Creating a new ChromeDriver
        WebDriver driver = new ChromeDriver();

        // amazon
        driver.get("https://www.amazon.in");
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();

        // User Details
        WebElement emailInput = driver.findElement(By.id("ap_email"));
        emailInput.sendKeys("9952456580");

        // Buttons
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Password
        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("ranjith2002");

        // Signin buttons
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
        // website title
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();

        //check whether the website title is correct or not
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case 1 Passed: Website title is correct.");
        } else {
            System.out.println("Test Case 1 Failed: Website title is incorrect.");
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy Book2 (NP750) Intel 12th Gen core i5 39.6cm (15.6\") FHD Thin & Light Laptop (8 GB/512 GB/Windows 11/MS Office/Backlit Keyboard/Finger Print Reader/Silver/1.55Kg), NP750XED-KC1IN");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
        String searchQuery = "Samsung Galaxy Book2 (NP750) Intel 12th Gen core i5 39.6cm (15.6\") FHD Thin & Light Laptop (8 GB/512 GB/Windows 11/MS Office/Backlit Keyboard/Finger Print Reader/Silver/1.55Kg), NP750XED-KC1IN";
        WebElement first = driver.findElement(By.xpath("//div[@data-index='0']//h2/a"));
        first.click();

        // product detail
        WebElement productTitle = driver.findElement(By.id("Samsung Galaxy Book2 (NP750) Intel 12th Gen core i5 39.6cm (15.6\") FHD Thin & Light Laptop (8 GB/512 GB/Windows 11/MS Office/Backlit Keyboard/Finger Print Reader/Silver/1.55Kg), NP750XED-KC1IN"));
        assert productTitle.isDisplayed();
        //price
        WebElement Price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
        assert Price.isDisplayed();
        //rating
        WebElement Rating = driver.findElement(By.xpath("//span[@id='acrPopover']"));
        assert Rating.isDisplayed();
        //review
        WebElement Reviews = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']"));
        assert Reviews.isDisplayed();

        // result display
        String pageTitle = driver.getTitle();
        assert pageTitle.contains("Samsung Galaxy Book2 (NP750) Intel 12th Gen core i5 39.6cm (15.6\") FHD Thin & Light Laptop (8 GB/512 GB/Windows 11/MS Office/Backlit Keyboard/Finger Print Reader/Silver/1.55Kg), NP750XED-KC1IN");
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addToCartButton);


    }
}
