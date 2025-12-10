package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product {
    private WebDriver driver;
    private By addtoCart = By.cssSelector("[data-product-id ='1']");

    public Product(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnAddToCart(){
        driver.findElement(addtoCart).click();
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
