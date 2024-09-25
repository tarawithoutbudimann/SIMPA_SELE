package NEG;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEGLoginTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void test() throws InterruptedException {
        this.driver.get("https://simpa.datains.id/login");
        WebElement usernamefield = this.driver.findElement(By.id("username"));
        usernamefield.sendKeys(new CharSequence[]{"it.cgkah"});
        WebElement passwordfield = this.driver.findElement(By.id("password"));
        passwordfield.sendKeys(new CharSequence[]{"Angkasapura001"});
        WebElement SignInButton = this.driver.findElement(By.id("loginButton"));
        SignInButton.click();
        String currentURL = this.driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("https://simpa.datains.id/login"));
    }
}
