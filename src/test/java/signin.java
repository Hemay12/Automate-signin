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

        driver.get("https://github.com/login");

        WebElement userName = driver.findElement(By.cssSelector("#login_field"));
        userName.sendKeys("Hemay12");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hemay@1234");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        Assert.assertTrue(driver.getPageSource().contains("Incorrect username or password"), "Login error message not found!");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
