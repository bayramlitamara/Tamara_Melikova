package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SlidersPage extends BasePage {

    private By tempSlider = By.id("tempSlider");
    private By tempValue = By.id("tempVal");
    private By volSlider = By.id("volSlider");
    private By volValue = By.id("volVal");

    private WebDriverWait wait;

    public SlidersPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String getTempValueText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(tempValue)).getText();
    }

    public String getVolValueText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(volValue)).getText();
    }

    public void setTempSlider(int value) {
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(tempSlider));
        setSliderValue(slider, value);
    }

    public void setVolSlider(int value) {
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(volSlider));
        setSliderValue(slider, value);
    }

    private void setSliderValue(WebElement slider, int value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));",
                slider, value
        );
    }
}