import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver;


// Creating 'WebDriver' Object.
// InterFace > Key - Function
// ChromeDriver,FirefoxDriver(geckoDriver), SafariDriver, Edge
//WebDriver driver = new FirefoxDriver();

WebDriver driver = new ChromeDriver();
//Invoking 'chromeDriver'
// key  - Value setProperty
// System.setProperty("webdriver.chrome.driver", "/Users/thodlaskaris/Desktop/chromeDriver/chromedriver") // Either using Selenium Manager.
driver.get("http://www.google.com");
println("The websites title is ${driver.getTitle()} " +
        "and the link is  ${driver.getCurrentUrl()}")
driver.quit();
