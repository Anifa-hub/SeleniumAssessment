package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test

    public void testDropDown(){
       // var selecting = homePage.clickLogin().clickSignupButton();
        var sign = homePage.clickLogin();
        sign.setUsername("anifa");
        sign.setEmail("anifabazubagira@gmail.com");
       var selecting = sign.clickSignupButton();
        String element = "India";
        selecting.selectFromDropdown(element);
        var selectedElement = selecting.getSelectedOPtions();
        assertEquals(selectedElement.size(), 1,"Incorrect selected option");
        assertTrue(selectedElement.contains(element),"Incorrect selected option");
    }
}
