import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@RunWith(Parameterized.class)
public class EntryFind {
    WebDriver driver;

    public EntryFind(WebDriver driver){this.driver=driver;}

    private final By findEntry = By.xpath("//input[@placeholder='Username...']");
    private final By findButton = By.xpath("//button[text()='Search']");
    private final By errorcheck = By.xpath ("(//div[@class='gh-search']//div)[3]");

    public void clickButtonSearch() {
        driver.findElement(findEntry).click();
    }

    public void enterFillSearchField() {
        driver.findElement(findButton).sendKeys("слово");
    }
    public void enterFillSearchField1() {
        driver.findElement(findButton).sendKeys("11111");
    }
    public void enterFillSearchField2() {
        driver.findElement(findButton).sendKeys("+++++");
    }
    public void enterFillSearchField3() {
        driver.findElement(findButton).sendKeys("-");
    }
    public void enterFillSearchField4() {
        driver.findElement(findButton).sendKeys("");
    }
}