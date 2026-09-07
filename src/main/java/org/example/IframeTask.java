package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeTask {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anarabbas.com/labs/auto-lab.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.cssSelector("button[data-p='iframe']")).click();


        WebElement birinciFrame = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("demoFrame"))
        );
        driver.switchTo().frame(birinciFrame);


        WebElement frameInput = driver.findElement(By.id("frameInput"));
        frameInput.sendKeys("Tamara");
        driver.findElement(By.id("frameBtn")).click();


        WebElement ikinciFrame = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("innerFrame"))
        );
        driver.switchTo().frame(ikinciFrame);


        driver.findElement(By.id("innerFrameBtn")).click();


        driver.switchTo().defaultContent();


        WebElement esasSehifeElementi = driver.findElement(By.xpath("//h3[text()='iFrame']"));
        System.out.println("Əsas səhifəyə qayıtdıq. Element mətni: " + esasSehifeElementi.getText());

        driver.quit();

    }
}
