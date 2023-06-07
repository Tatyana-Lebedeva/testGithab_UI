import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseInfo {
    WebDriver driver = new ChromeDriver();
    public WebDriver getDriver() {
        return driver;
    }

    private static final String url = "https://solitclouds.github.io/qa-test/";
    public void openUrl() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }
    public void baseAfter(WebDriver driver) {
        driver.quit();
    }
}
