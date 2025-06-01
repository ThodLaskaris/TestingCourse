import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


WebDriver driver = new ChromeDriver();

driver.get("https://rahulshettyacademy.com/locatorspractice/")
driver.findElement(By.id("inputUsername"))
        .sendKeys("rahul")
driver.findElement(By.name("inputPassword"))
.sendKeys("helloWorld")
driver.findElement(By.className("signInBtn")).click()