package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsModal {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anarabbas.com/labs/auto-lab.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.cssSelector("button[data-p='modal']")).click();


        driver.findElement(By.id("alertBtn")).click();
        Alert sadeAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Sadə alert mətni: " + sadeAlert.getText());
        sadeAlert.accept();

        driver.findElement(By.id("confirmBtn")).click();
        Alert confirmAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Confirm alert mətni: " + confirmAlert.getText());
        confirmAlert.dismiss();


        driver.findElement(By.id("promptBtn")).click();
        Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Prompt alert mətni: " + promptAlert.getText());
        promptAlert.sendKeys("Tamara");
        promptAlert.accept();


        driver.findElement(By.id("openModal")).click();


        WebElement modalOverlay = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("modalOverlay"))
        );

        WebElement modalInput = modalOverlay.findElement(By.id("modalInput"));
        modalInput.sendKeys("Tamara");

        modalOverlay.findElement(By.id("modalSubmit")).click();

        driver.quit();
    }
}
