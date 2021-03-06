package uitest.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import uitest.commands.SeleniumCommands

class RegistrationPage(driver: WebDriver) {
  private val sc: SeleniumCommands = new SeleniumCommands(driver)
  val url = sc.URL + "register"

  @FindBy(name = "login")
  val loginField: WebElement = null

  @FindBy(name = "email")
  val emailField: WebElement = null

  @FindBy(name = "password")
  val passwordField: WebElement = null

  @FindBy(name = "repeatPassword")
  val repeatPassField: WebElement = null

  @FindBy(css = "button[type=submit]")
  val registerButton: WebElement = null

  def register(login: String, email: String, password: String) {
    openRegistrationPage()
    loginField.sendKeys(login)
    emailField.sendKeys(email)
    passwordField.sendKeys(password)
    repeatPassField.sendKeys(password)
    registerButton.click()
    sc.waitForFinishLoading()
  }

  def openRegistrationPage() {
    driver.get(url)
    sc.waitForFinishLoading()
  }
}
