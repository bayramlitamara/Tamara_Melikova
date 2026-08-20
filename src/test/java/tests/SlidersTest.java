package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SlidersPage;

public class SlidersTest {

    private WebDriver driver;
    private SlidersPage slidersPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        driver.findElement(By.cssSelector("button[data-p='slider']")).click();
        slidersPage = new SlidersPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testDefaultValues() {
        Assert.assertEquals(slidersPage.getTempValueText(), "50°C");
        Assert.assertEquals(slidersPage.getVolValueText(), "75%");
    }

    @Test
    public void testTemperatureChange() {
        slidersPage.setTempSlider(25);
        Assert.assertEquals(slidersPage.getTempValueText(), "25°C");
    }

    @Test
    public void testVolumeChange() {
        slidersPage.setVolSlider(40);
        Assert.assertEquals(slidersPage.getVolValueText(), "40%");
    }

    @Test
    public void testTemperatureBoundaries() {
        slidersPage.setTempSlider(0);
        Assert.assertEquals(slidersPage.getTempValueText(), "0°C");
        slidersPage.setTempSlider(100);
        Assert.assertEquals(slidersPage.getTempValueText(), "100°C");
    }

    @Test
    public void testVolumeBoundaries() {
        slidersPage.setVolSlider(0);
        Assert.assertEquals(slidersPage.getVolValueText(), "0%");
        slidersPage.setVolSlider(100);
        Assert.assertEquals(slidersPage.getVolValueText(), "100%");
    }
}