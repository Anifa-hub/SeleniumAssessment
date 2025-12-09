package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private WebDriver driver;
    private By userNameField = By.cssSelector("input[name='name']");
    private By emailField = By.cssSelector("input[data-qa='signup-email']");
    private By signUpButton = By.cssSelector("button[data-qa='signup-button']");

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    //on account information is where I am going to test dropdown
    public AccountInformationPage clickSignupButton(){
        driver.findElement(signUpButton).click();
        return new AccountInformationPage (driver);
    }

}
