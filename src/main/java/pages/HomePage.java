package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    private WebDriver driver;
    private By scrollBox = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupPage clickLogin(){
        clickLink("Signup / Login");
        return new SignupPage(driver);
    }




    // testing Modal on productpage
    public Product clickOnProduct(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();
        return new Product(driver);
    }


    //Scrolling products on homePage
    public void scrollToProducts(){
        WebElement productsElement = driver.findElement(scrollBox);
        String script = "arguments[0].scrollIntoView;";
        ((JavascriptExecutor)driver).executeScript(script,productsElement);
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

