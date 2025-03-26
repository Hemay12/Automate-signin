import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signin {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void automateSignIn(){

        driver.get("https://innovateoperations.greythr.com/uas/portal/auth/login?login_challenge=88ae8dc9775c4bb98bb8721662169720");

        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("1265");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Kinnu@1731");

        WebElement submit = driver.findElement(By.xpath("//button[text()=' Log in ']"));
        submit.click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).click();

        // Assert.assertTrue(driver.getPageSource().contains("Incorrect username or password"), "Login error message not found!");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
