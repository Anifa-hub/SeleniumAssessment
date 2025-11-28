package scrolling;

import base.BaseTests;
import org.testng.annotations.Test;

public class Scroll extends BaseTests {
    @Test

    public void testSrollOnHome(){
        homePage.scrollToProducts();
    }
}
