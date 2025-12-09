package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private  WebDriver driver;
  private By emailField = By.cssSelector("input[data-qa='login-email']");
  private By passwordField = By.cssSelector("input[data-qa='login-password']");
  private By loginButton = By.cssSelector("button[data-qa='login-button']");

    public LoginPage(WebDriver driver){this.driver = driver;}

    public HomePage login(){
        driver.findElement(emailField).sendKeys("anifabazubagira@gmail.com");
        driver.findElement(passwordField).sendKeys("1234");
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }


}
