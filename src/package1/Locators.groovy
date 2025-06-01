import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver

import java.time.Duration;


WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))

driver.get("https://rahulshettyacademy.com/locatorspractice/")
driver.findElement(By.id("inputUsername"))
        .sendKeys("rahul")

driver.findElement(By.name("inputPassword"))
        .sendKeys("helloWorld")

driver.findElement(By.className("signInBtn"))
        .click()

//  tagName[attribute='value']
//  tagName.className
//  tagName#id
//  ChroPath SelectorsHub(Chrome plugin) to safe check unique selector
//  Or console => $('') to see the selector to see if it's unique.

//  Implicit wait - 5secs time = function ( wait 5 sec ) function

//  Xpath
//  //tagName[@attribute='value']
//   x('') console.

println(driver.findElement(By.cssSelector("p.error"))
        .getText())

driver.findElement(By.linkText("Forgot your password?"))
        .click()

driver.findElement(By.xpath("//input[@placeholder='Name']"))
        .sendKeys("ForgotPasswordUsernameField")
driver.findElement(By.xpath("//input[@placeholder='Password']"))
        .sendKeys("ForgotPasswordPasswordField")
driver.findElement(By.xpath("//input[@placeholder='Email']"))
        .sendKeys("randomEmail")
driver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
        .sendKeys("1212121212")
driver.findElement(By.cssSelector(".go-to-login-btn"))
        .click()