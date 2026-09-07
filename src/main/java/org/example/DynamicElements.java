package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anarabbas.com/labs/auto-lab.html");


        driver.findElement(By.cssSelector("button[data-p='dyn']")).click();


        WebElement acDugme = driver.findElement(By.id("delayBtn"));
        acDugme.click();


        long baslangicVaxti = System.currentTimeMillis();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement gecikenElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("dynReveal"))
        );

        long bitisVaxti = System.currentTimeMillis();
        long kecenMuddet = bitisVaxti - baslangicVaxti;

        System.out.println("Element mətni: " + gecikenElement.getText());
        System.out.println("Element görünməyə " + kecenMuddet + " millisaniyə çəkdi.");

        driver.quit();
    }
}
