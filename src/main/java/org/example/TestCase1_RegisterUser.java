package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1_RegisterUser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        By signupLogin = By.xpath("//*[contains(text(),'Signup / Login')]");
        By newUserText = By.xpath("//*[contains(text(),'New')]");
        By namefield = By.cssSelector("[data-qa='signup-name']");
        By emailfield = By.cssSelector("[data-qa='signup-email']");
        By signupButton = By.cssSelector("[data-qa='signup-button']");
        By accountInf = By.xpath("//*[contains(text(),'Enter')]");
        By radio = By.id("id_gender2");
        By name_1field = By.id("name");
        By email_1Field = By.id("email");
        By pass = By.id("password");
        By dayofBirt = By.id("days");
        By monthofBirt = By.id("months");
        By yearsofBirt = By.id("years");
        By newslet = By.id("newsletter");
        By offers = By.id("optin");

        WebElement signLog = driver.findElement(signupLogin);
        signLog.click();
        WebElement newUser= driver.findElement(newUserText);
        System.out.println("New user text is visibe " + newUser.isDisplayed());
        WebElement name = driver.findElement(namefield);
        name.sendKeys("John");
        WebElement email = driver.findElement(emailfield);
        email.sendKeys("john@abc2.com");
        WebElement signbutton = driver.findElement(signupButton);
        signbutton.click();
        WebElement accInf = driver.findElement(accountInf);
        System.out.println("Account Inf is visible " + accInf.isDisplayed());
        WebElement radio2 = driver.findElement(radio);
        radio2.click();
        WebElement name_1= driver.findElement(name_1field);
        WebElement email_1= driver.findElement(email_1Field);
        WebElement password = driver.findElement(pass);
        name_1.clear();
        name_1.sendKeys("Johnik");
        email_1.isDisplayed();
        password.sendKeys("123456");
        WebElement day1 = driver.findElement(dayofBirt);
        Select day = new Select(day1);
        day.selectByVisibleText("17");
        WebElement month1 = driver.findElement(monthofBirt);
        Select month = new Select(month1);
        month.selectByVisibleText("July");
        WebElement year1 = driver.findElement(yearsofBirt);
        Select year = new Select(year1);
        year.selectByValue("2004");
        WebElement news= driver.findElement(newslet);
        news.click();
        WebElement offer = driver.findElement(offers);
        offer.click();

        // for offers
        WebElement first_name = driver.findElement(By.id("first_name"));
        WebElement last_name = driver.findElement(By.id("last_name"));
        WebElement company = driver.findElement(By.id("company"));
        WebElement address = driver.findElement(By.id("address1"));
        WebElement address2 = driver.findElement(By.id("address2"));
        WebElement conutry = driver.findElement(By.id("country"));
        first_name.sendKeys("John");
        last_name.sendKeys("smith");
        company.sendKeys("amazon");
        address.sendKeys("US, arizona");
        address2.sendKeys("address2");
        Select contry_1 = new Select(conutry);
        contry_1.selectByVisibleText("United States");
        WebElement state = driver.findElement(By.id("state"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement zipcode = driver.findElement(By.id("zipcode"));
        WebElement mobile = driver.findElement(By.id("mobile_number"));
        state.sendKeys("Arizona");
        city.sendKeys("tucson");
        zipcode.sendKeys("ABD4121");
        mobile.sendKeys("1254221");
        WebElement submit = driver.findElement(By.cssSelector("[data-qa=create-account]"));
        submit.click();
        WebElement accountText = driver.findElement(By.cssSelector("[data-qa=account-created]"));
        System.out.println("Acoount Created is visibe " + accountText.isDisplayed());
        WebElement contButton = driver.findElement(By.cssSelector("[data-qa=continue-button]"));
        contButton.click();
        WebElement userLogedinIcon = driver.findElement(By.xpath("//*[contains(text(),'Johnik')]"));
        userLogedinIcon.isDisplayed();

        //deleting Account

        /*WebElement deleteAccount = driver.findElement(By.xpath("//*[contains(text(),'Delete Account')]"));
        deleteAccount.click();
        WebElement deletedAccountText = driver.findElement(By.cssSelector("[data-qa=account-deleted]"));
        System.out.println("Deleted account text is visibe " + deletedAccountText.isDisplayed());
        WebElement contFromDelete = driver.findElement(By.cssSelector("[data-qa=continue-button]"));
        contFromDelete.click();*/
        driver.quit();
    }
}
