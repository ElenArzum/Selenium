package org.example;

import org.bouncycastle.est.ESTSourceConnectionListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class ElementsStates {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        WebElement button1 = driver.findElement(By.id("but1"));
        WebElement button2 = driver.findElement(By.id("but2"));
        WebElement delayed = driver.findElement(By.id("delayedText"));
        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
        WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
        System.out.println("button1 is enabled " + button1.isEnabled());
        System.out.println("button2 is enabled " + button2.isEnabled());
        System.out.println("Text is visible " + delayed.isDisplayed());
        sleep(10000);
        System.out.println("Text is visible " + delayed.isDisplayed());
        System.out.println(checkbox1.isSelected());
        checkbox1.click();
        System.out.println(checkbox1.isSelected());
        WebElement multiselect = driver.findElement(By.id("multiselect1"));
        Select mult = new Select(multiselect);
        List<WebElement> selectedOptions = mult.getAllSelectedOptions();
        for(WebElement element: selectedOptions){
            System.out.println(element.getText());

        }




    }
}
