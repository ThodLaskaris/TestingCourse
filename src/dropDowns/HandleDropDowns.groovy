import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

import java.util.logging.*

Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE)


WebDriver driver = new ChromeDriver()
driver.get("https://rahulshettyacademy.com/dropdownsPractise")
//  Dropdown with select Tag { Static dropdown }
WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))
Select dropdown = new Select(staticDropDown)

dropdown.selectByIndex(3)
println(dropdown.getFirstSelectedOption().getText())


dropdown.selectByVisibleText("AED")
println(dropdown.getFirstSelectedOption().getText())


dropdown.selectByValue("INR")
println(dropdown.getFirstSelectedOption().getText())