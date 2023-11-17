package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        By signupLogin = By.xpath("//*[contains(text(),'Signup / Login')]");
        WebElement signup = driver.findElement(signupLogin);
        signup.click();
        By logInText = By.xpath("//*[contains(text(),'Login to')]");
        WebElement login = driver.findElement(logInText);
        System.out.println("Login text is visible " + login.isDisplayed());
        WebElement email = driver.findElement(By.cssSelector("[data-qa=login-email]"));
        WebElement password = driver.findElement(By.cssSelector("[data-qa=login-password]"));
        email.sendKeys("john@a25bc2.com");
        password.sendKeys("12345651");
        WebElement loginButton = driver.findElement(By.cssSelector("[data-qa=login-button]"));
        loginButton.click();
        WebElement incorrectText = driver.findElement(By.xpath("//*[contains(text(),'incorrect')]"));
        System.out.println("Incorrect email or pass is visible " + incorrectText.isDisplayed());
        driver.quit();
    }
}