package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/");
        String handle = driver.getWindowHandle();
    }
}
