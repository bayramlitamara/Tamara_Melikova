package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url = "https://anarabbas.com/labs/auto-lab.html";
        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

        // ---------- "BUTTONS" KATEQORİYASINA KEÇ (data-p atributu ilə) ----------
        WebElement buttonsMenyu = driver.findElement(By.cssSelector("button[data-p='btn']"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", buttonsMenyu);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", buttonsMenyu);
        Thread.sleep(1500);

        // ---------- PRIMARY CLICK ----------
        WebElement primaryClick = driver.findElement(By.id("clickBtn"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", primaryClick);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", primaryClick);
        Thread.sleep(1500);

        // ---------- DOUBLE CLICK ----------
        WebElement dblBtn = driver.findElement(By.id("dblBtn"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dblBtn);
        Thread.sleep(1000);
        action.moveToElement(dblBtn).doubleClick().perform();
        Thread.sleep(1500);

        // ---------- RIGHT CLICK (düzgün ID: rcBtn) ----------
        WebElement rcBtn = driver.findElement(By.id("rcBtn"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", rcBtn);
        Thread.sleep(1000);
        action.moveToElement(rcBtn).contextClick().perform();
        Thread.sleep(1500);

        // ---------- DISABLED BUTTON ----------
        WebElement disabledBtn = driver.findElement(By.xpath("//button[@disabled]"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", disabledBtn);
        Thread.sleep(1000);
        System.out.println("Disabled aktivdirmi? " + disabledBtn.isEnabled());

        Thread.sleep(2000);

        driver.quit();
    }
}