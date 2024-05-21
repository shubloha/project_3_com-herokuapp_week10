package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl =  "http://the-internet.herokuapp.com/login";
        //1. Setup Chrome browser.
        WebDriver driver = new ChromeDriver();
        //2. Open URL.
        driver.get(baseUrl);
        //3. Print the title of the page.
        String title =driver.getTitle();
        System.out.println(title);

        //4.Print the current url.
       String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //5. Print the page source.
        String pageSource =driver.getPageSource();
        System.out.println(pageSource);
        //6. Enter the email to email field.
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //8. Click on Login Button.
        driver.findElement(By.className("radius")).click();




    }



}
