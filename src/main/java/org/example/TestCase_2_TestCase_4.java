package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2_TestCase_4 {
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
        System.out.println("Login text is visible " +login.isDisplayed());
        WebElement email = driver.findElement(By.cssSelector("[data-qa=login-email]"));
        WebElement password = driver.findElement(By.cssSelector("[data-qa=login-password]"));
        email.sendKeys("john@abc2.com");
        password.sendKeys("123456");
        WebElement loginButton = driver.findElement(By.cssSelector("[data-qa=login-button]"));
        loginButton.click();
        WebElement userLogedinIcon = driver.findElement(By.xpath("//*[contains(text(),'Johnik')]"));
        userLogedinIcon.isDisplayed();
        WebElement logoutButton = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        logoutButton.click();
        System.out.println(driver.getTitle());





        /*WebElement deleteAccount = driver.findElement(By.xpath("//*[contains(text(),'Delete Account')]"));
        deleteAccount.click();
        WebElement deletedAccountText = driver.findElement(By.cssSelector("[data-qa=account-deleted]"));
        System.out.println("Deleted account text is visibe " + deletedAccountText.isDisplayed());
        WebElement contFromDelete = driver.findElement(By.cssSelector("[data-qa=continue-button]"));
        contFromDelete.click();*/
       // driver.quit();
    }
}
