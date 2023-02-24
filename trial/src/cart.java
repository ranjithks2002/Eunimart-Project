import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {
    public static void main(String[] args) {
        // Set the path to the Chrome driver executable
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ranji\\Downloads\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Amazon website
        driver.get("https://www.amazon.com/");

        // Find the search bar and enter a search term
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung Galaxy Book2 (NP750) Intel 12th Gen core i5 39.6cm (15.6\\\") " +
                "FHD Thin & Light Laptop (8 GB/512 GB/Windows 11/MS Office/Backlit Keyboard/Finger Print Reader/Silver/1.55Kg), NP750XED-KC1IN\");\n" + "       ");

        // Click the search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        // Find the first search result and click it
        WebElement searchResult = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        searchResult.click();

        // Find the add to cart button and click it
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // Close the browser window
        driver.quit();
    }
}
