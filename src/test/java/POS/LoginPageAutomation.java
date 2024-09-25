package POS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAutomation {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://simpa.datains.id/login");
        WebElement usernamefield = driver.findElement(By.id("username"));
        usernamefield.sendKeys(new CharSequence[]{"it.cgk"});
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys(new CharSequence[]{"Angkasapura001"});
        WebElement SignInButton = driver.findElement(By.id("loginButton"));
        SignInButton.click();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("https://simpa.datains.id/dashboard"));
    }
}
