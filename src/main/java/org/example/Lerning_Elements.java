package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lerning_Elements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
       // WebElement promt = driver.findElement(By.cssSelector("input[id^='prom']")); //petqa valuen sksi ^
        WebElement promt = driver.findElement(By.cssSelector("input[value$='Prompt']")); // petqa valuen avartvi
        WebElement button = driver.findElement(By.cssSelector("input[value*='Button']"));
        WebElement somed = driver.findElement(By.cssSelector("div#HTML38.widget[data-version='1']"));// tag(div) id(#HTML38) class(.widget) attribute[data-version='1']

        WebElement button2 = driver.findElement(By.xpath("//button[@name='samename']"));//  //*[@name='samename'] f tag no mater
        WebElement text = driver.findElement(By.xpath("//buton[text()='Submit']"));
        WebElement text2 = driver.findElement(By.xpath("//button[contains(text),)]"));
        promt.click();
    }
}
