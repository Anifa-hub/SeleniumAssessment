package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By proceedToCheck = By.className("btn btn-default check_out");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void  clickOnProceedToCheck(){
        driver.findElement(proceedToCheck).click();
    }


}
