package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By userNameField = By.cssSelector("input[name='name']");
    private By emailField = By.cssSelector("input[name='email']");
    private By subjectField = By.cssSelector("input[name='subject']");
    private By messageField = By.cssSelector("textarea[name='message']");
    private By fileUpload = By.cssSelector("input[name='upload_file']");
    private By submitButton = By.cssSelector("input[name='submit']");

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

    //asssert
    public String confirmAssertion(){
      return  driver.findElement(By.cssSelector(".status")).getText();
    }
}
