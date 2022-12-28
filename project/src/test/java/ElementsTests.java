import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ElementsTests {
    WebDriver _driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","/Users/ua0822/Downloads/chromedriver");
        this._driver = new ChromeDriver();
        this._driver.get("https://www.demoblaze.com/");
    }
    @BeforeGroups
    public void beforeGroups() {
        System.setProperty("webdriver.chrome.driver","/Users/ua0822/Downloads/chromedriver");
        this._driver = new ChromeDriver();
        this._driver.get("https://www.demoblaze.com/");
    }

    @Test (description = "Testing if phones label is there" , groups = "SmokeSuite")
    public void FindPhones() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
        String url = _driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }
    @Test (description = "Testing if laptops label is there" , groups = "SmokeSuite")
    public void FindLaptops() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
        String url = _driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }
    @Test (description = "Testing if monitor label is there" , groups = "SmokeSuite")
    public void FindMonitors() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
        String url = _driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test (description = "Testing if FindAddToCartButton label is there" , groups = "SmokeSuite")
    public void FindAddToCartButton() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
        String url = "https://www.demoblaze.com/prod.html?idp_=5";
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test (description = "Testing if productDrescription label is there" , groups = "SmokeSuite")
    public void FindproductDrescription() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/div"));
        String url = "https://www.demoblaze.com/prod.html?idp_=5";
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test (description = "Testing if price label is there" , groups = "SmokeSuite")
    public void Findprice() {
        WebElement testTextBox = _driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h3"));
        String url = "https://www.demoblaze.com/prod.html?idp_=5";
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test
    public void TestURLisCorrect () {
        String expectedURL = "https://www.demoblaze.com/";
        String actualURL = _driver.getCurrentUrl();

        CustomAssertions.isURLValid(expectedURL, actualURL);
    }

    @AfterMethod
    public void tearDown() {
        _driver.quit();
    }
    @AfterGroups
    public void afterGroups() {
        _driver.quit();
    }
}