package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class loginTests extends BaseTests {
    @Test

    public void testlogin(){
        var home = homePage.clickLoginPage();
        home.login();
        // uncomment that if you want to delete an account
//        homePage.deleteAccount();
//        assertEquals(homePage.confirmDeleteAccount(),"Account Deleted!".toUpperCase(),"Account Deleted Successfully");
    }

}
