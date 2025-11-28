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
    private By dropWomen = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupPage clickLogin(){
        clickLink("Signup / Login");
        return new SignupPage(driver);
    }

   // clicking on women category for dropdown

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropWomen));
    }
    public List<String> getSelectedOPtions(){
        List <WebElement> selectedOption = findDropdownElement().getAllSelectedOptions();
        return selectedOption.stream().map(i->i.getText()).collect(Collectors.toList());
    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    // testing Modal
    public Product clickOnProduct(){
        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")).click();
        return new Product(driver);
    }

    // Testing Alert on home page by adding a product to cart
    public void clickOnAdCart(){
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a"));
    }


    //Scrolling
    public void scrollToProducts(){
        WebElement tableElement = driver.findElement(scrollBox);
        String script = "arguments[0].scrollIntoView;";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);
    }




    public void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }


}

