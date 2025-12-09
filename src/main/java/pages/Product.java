package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product {
    private WebDriver driver;
    private By addtoCart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");

    public Product(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnAddToCart(){
        driver.findElement(addtoCart).click();
    }

    public String getTextOnPopUp() {
        String answer = "";
         By getCartMessage = By.cssSelector("#cartModal > div > div > div.modal-header > h4");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleOfElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(getCartMessage)));

        answer = titleOfElement.getText();
        return answer;
    }
}
