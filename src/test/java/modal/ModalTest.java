package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTests {
    @Test

    public void testModal(){
       var modal = homePage.clickOnProduct();
       modal.clickOnAddToCart();
      // assertEquals(modal.getTextOnPopUp(), "Added!","Incorrect text");
    }
}
