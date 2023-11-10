package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        By logo_pic = By.cssSelector(".logo");
        By home_button = By.cssSelector("[class*=navbar]>li:first-of-type");
        By products_button = By.cssSelector("[class*=navbar]>li:nth-of-type(2)");
        By card_button = By.cssSelector("[class*=navbar]>li:nth-of-type(3)");
        By login_button = By.cssSelector("[class*=navbar]>li:nth-of-type(4)");
        By contact_button = By.cssSelector("[class*=navbar]>li:last-of-type");
        By category_Women = By.cssSelector("a[href='#Women']");
        By category_Men = By.cssSelector("a[href='#Men']");
        By category_Kids = By.cssSelector("a[href='#Kidd']");
        By Women_plusIcon = By.cssSelector("a[href='#Women'] > .badge");
        By Men_plusIcon = By.cssSelector("a[href='#Men'] > .badge");
        By Kids_plusIcon =  By.cssSelector("a[href='#Kids'] > .badge");
        By category_Women_dress = By.cssSelector("a[href='/category_products/1']");
        By catgory_Women_tops = By.cssSelector("a[href='/category_products/2']");
        By category_Men_Jeans = By.cssSelector("a[href='/category_products/6']");
        By brand_Polo = By.cssSelector("a[href='/brand_products/Polo'] ");
        By subscribe_field = By.id("success-subscribe");
        By subscribe_button = By.id("subsribe");
        By slide_Carousel = By.cssSelector("#slider-carousel > ol > li:nth-child(1)");
        By products_searchProduct = By.className("form-control");
        By products_searchProductSubmit = By.id("search_product");
        By login_signupLoginEmail = By.cssSelector("[placeholder='Email Address'][data-qa='login-email']");
        By login_signupLoginPassword = By.cssSelector("[placeholder='Password'][data-qa='login-password']");
        By login_login0iconbutton = By.cssSelector(".btn-default[data-qa='login-button']");
        By scrollUpIcon = By.className(".fa-angle-up");
        By product_Example =By.cssSelector(".choose .nav-pills [href='/product_details/1']");
        By quantityofProduct = By.id("quantity");
        By quantityclik = By.id("product_id"); ////
        By addtoCart = By.cssSelector("[type='button']");
        By viewCart = By.cssSelector(".text-center [href='/view_cart']");

        driver.manage().window().maximize();
        WebElement productClick = driver.findElement(product_Example);
        productClick.click();
        WebElement quantity = driver.findElement(quantityofProduct);
        quantity.sendKeys("2");
        Thread.sleep(1000);
       // WebElement clicking = driver.findElement(quantityclik); ///////// !!!/
        //clicking.click();
        WebElement addingCart = driver.findElement(addtoCart);
        addingCart.click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement by1 = driver.findElement(login_button );
        by1.click();
        WebElement by2 = driver.findElement(login_signupLoginEmail);
        by2.sendKeys("login");
        Thread.sleep(1000);
        WebElement by3 = driver.findElement(login_signupLoginPassword);
        by3.sendKeys("pass");
        WebElement by4 = driver.findElement(login_login0iconbutton);
        by4.click();
        Thread.sleep(1000);
        driver.navigate().back();
        WebElement by5 = driver.findElement(products_button);
        by5.click();
        driver.quit();
    }
}