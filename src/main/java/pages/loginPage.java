package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By userNameField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    public loginPage(WebDriver driver){
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
