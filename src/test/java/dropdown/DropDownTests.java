package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test

    public void testDropDown(){
        String element = "Option 1";
        homePage.selectFromDropdown(element);
        var selectedElement = homePage.getSelectedOPtions();
        assertEquals(selectedElement.size(), 1,"Incorrect selected option");
        assertTrue(selectedElement.contains(element),"Incorrect selected option");
    }
}
