package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class AccountInformationPage {
    private WebDriver driver;
    private By input = By.cssSelector("#country");
    public AccountInformationPage(WebDriver driver){
        this.driver = driver;
    }
    private Select findDropdownElement(){
        return new Select(driver.findElement(input));
    }
    public List<String> getSelectedOPtions(){
        List <WebElement> selectedOption = findDropdownElement().getAllSelectedOptions();
        return selectedOption.stream().map(i->i.getText()).collect(Collectors.toList());
    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
}
