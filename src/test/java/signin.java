import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin {

    @Test
    public void automateSignIn(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement userName = driver.findElement(By.cssSelector("#login_field"));
        userName.sendKeys("Hemay12");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hemay@123");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

    }
}
