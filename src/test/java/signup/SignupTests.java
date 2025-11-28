package signup;

import base.BaseTests;
import org.testng.annotations.Test;

public class SignupTests extends BaseTests {

    @Test

    public void testSignup(){
        var sign = homePage.clickLogin();
        sign.setUsername("anifa");
        sign.setEmail("anifabazubagira@gmail.com");
        sign.clickSignupButton();


    }

}
