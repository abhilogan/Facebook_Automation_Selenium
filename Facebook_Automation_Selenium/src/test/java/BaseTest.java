import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Start...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Windows/Desktop/New folder/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
