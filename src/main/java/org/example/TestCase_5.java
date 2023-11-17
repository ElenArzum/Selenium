package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        By signupLogin = By.xpath("//*[contains(text(),'Signup / Login')]");
        WebElement signup = driver.findElement(signupLogin);
        signup.click();
        By newUserText = By.xpath("//*[contains(text(),'New')]");
        WebElement newUser = driver.findElement(newUserText);
        System.out.println("signup text is visible " + newUser.isDisplayed());
        WebElement name = driver.findElement(By.cssSelector("[data-qa=signup-name]"));
        WebElement email = driver.findElement(By.cssSelector("[data-qa=signup-email]"));
        name.sendKeys("Johnik");
        email.sendKeys("john@abc2.com");
        WebElement loginButton = driver.findElement(By.cssSelector("[data-qa=signup-button]"));
        loginButton.click();
        WebElement existText = driver.findElement(By.xpath("//*[contains(text(),'already exist')]"));
        System.out.println("Email Already exist is visible " + existText.isDisplayed());
        driver.quit();
    }
}
