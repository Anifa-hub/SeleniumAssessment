package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class AccountInformationPage {
    private WebDriver driver;
    private By tittle = By.id("id_gender2");
    private By passwordField = By.id("password");
    private By dayOfBirthField = By.id("days");
    private By monthOfBirthField = By.id("months");
    private By yearOfBirthField = By.id("years");
    private By newsLetter = By.id("newsletter");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By companyField = By.id("company");
    private By addressField = By.id("address1");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipCodeField = By.id("zipcode");
    private By mobileField = By.id("mobile_number");
    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");


    private By country = By.id("country");
    public AccountInformationPage(WebDriver driver){
        this.driver = driver;
    }

    //select tittle
    public void clickTittle(){

        driver.findElement(tittle).click();
    }
    //enter password
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    // select day of birth
    public void selectDay(){
        new Select(driver.findElement(dayOfBirthField)).selectByValue("3");
    }

    //select birthMonth
    public void selectMonth(){
        new Select(driver.findElement(monthOfBirthField)).selectByValue("5");
    }
    // select Birthyear
    public void selectYear(){
        new Select(driver.findElement(yearOfBirthField)).selectByValue("2003");
    }
    // select newsletters
    public void selectNewsletter(){
        driver.findElement(newsLetter).click();
    }
    // set firstname
    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    //set lastname
    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    //set company
    public void setCompany(String company){
        driver.findElement(companyField).sendKeys(company);
    }
    //set adress
    public void setAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    // select the country
    public void selectCountry(){
        new Select(driver.findElement(country)).selectByValue("India");
    }


    //set state
    public void setState(String state){
        driver.findElement(stateField).sendKeys(state);
    }
    //set city
    public void setCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }
    //set zipcode
    public void setZipCode(String zipCode){
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }
    public void setMobile(String mobile){
        driver.findElement(mobileField).sendKeys(mobile);
    }
    public void clickCreateAccountButton(){

        driver.findElement(createAccountButton).click();
    }
   public String sucess () {
     return  driver.findElement(By.cssSelector("div b")).getText();
   }
}

