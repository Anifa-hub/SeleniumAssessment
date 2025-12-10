package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;




    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupPage clickSignup(){
        clickLink("Signup / Login");
        return new SignupPage(driver);
    }

    public LoginPage clickLoginPage(){
        clickLink("Signup / Login");
        return new LoginPage(driver);
    }
    //delete account
//    public void deleteAccount(){
//        clickLink("Delete Account");
//    }
//    public String confirmDeleteAccount(){
//        return driver.findElement(By.cssSelector("div b")).getText();
//    }

    // testing Modal on productpage
    public Product clickOnProduct(){
        driver.findElement(By.partialLinkText("Products")).click();
        return new Product(driver);
    }


    // fileUpload on contact page
    public ContactPage clickOnContact(){
        //driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a"));
        clickLink("Contact us");
        return new ContactPage(driver);
    }




    public void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }


}

