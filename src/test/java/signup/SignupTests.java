package signup;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignupTests extends BaseTests {

    @Test

    public void testSignup(){
        var sign = homePage.clickSignup();
        sign.setUsername("anifa");
        sign.setEmail("anifabazubagira@gmail.com");
       var account = sign.clickSignupButton();
       account.clickTittle();
       account.setPassword("1234");
        account.selectDay();
        account.selectMonth();
        account.selectYear();
        account.selectNewsletter();
        account.setFirstName("anifa");
        account.setLastName("bazubagira");
        account.setCompany("TheGym");
        account.setAddress("Kinyinya");
        account.selectCountry();
        account.setState("nyamirambo");
        account.setCity("K");
        account.setZipCode("00000");
        account.setMobile("078119787");
        account.clickCreateAccountButton();
       assertEquals(account.sucess(), "Account Created!".toUpperCase(),"Account did not success.");

    }

}
