package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://anarabbas.com/labs/auto-lab";

        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        WebElement fullName = driver.findElement(By.id("fullName"));

        fullName.clear();
        fullName.sendKeys("Tamara Məlikova");

        WebElement email = driver.findElement(By.id("userEmail"));

        email.clear();
        email.sendKeys("bayramli.tamara@gmail.com");

        WebElement password = driver.findElement(By.id("passField"));

        password.clear();
        password.sendKeys("Test12345!");

        driver.quit();
    }
}

