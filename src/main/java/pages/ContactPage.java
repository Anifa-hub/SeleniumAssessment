package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By userNameField = By.cssSelector("#contact-us-form > div:nth-child(2) > input");
    private By emailField = By.cssSelector("#contact-us-form > div:nth-child(3) > input");
    private By subjectField = By.cssSelector("#contact-us-form > div:nth-child(4) > input");
    private By messageField = By.cssSelector("#message");
    private By fileUpload = By.cssSelector("#contact-us-form > div:nth-child(6) > input");
    private By filefield = By.cssSelector("#contact-us-form > div:nth-child(6)");
    private By submitButton = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");

    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setSubject(String subject){
        driver.findElement(subjectField).sendKeys(subject);
    }
    public void setMessage(String subject){
        driver.findElement(messageField).sendKeys(subject);
    }

    public void setFileUpload(String PathOfFile){
        driver.findElement(fileUpload).sendKeys(PathOfFile);
       clickSubmitButton();
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    //testing alert
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
