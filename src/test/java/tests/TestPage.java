package tests;

import base.BaseTest;
import model.LoginPage;
import model.SecuredPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage extends BaseTest {

    private static final String LOGIN_VALUE = "tomsmith";
    private static final String PASSWORD_VALUE = "SuperSecretPassword!";
    private static final String EXPECTED_SIGN_VALUE
            = "Welcome to the Secure Area. When you are done click logout below.";

    @Test
    public void testLoginAction(){

        SecuredPage securedPage = new LoginPage(getDriver())
                .fillLoginPassword(LOGIN_VALUE, PASSWORD_VALUE)
                .clickSaveButton();

        Assert.assertEquals(securedPage.getInfoSign(),EXPECTED_SIGN_VALUE);
    }
}