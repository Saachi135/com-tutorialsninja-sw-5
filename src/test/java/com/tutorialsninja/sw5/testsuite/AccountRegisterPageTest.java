package com.tutorialsninja.sw5.testsuite;

import com.tutorialsninja.sw5.pages.AccountRegisterPage;
import com.tutorialsninja.sw5.pages.HomePage;
import com.tutorialsninja.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountRegisterPageTest extends BaseTest {
    AccountRegisterPage accountRegisterPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        accountRegisterPage = new AccountRegisterPage();

    }


    @Test
    public void registerDetails() {
        homePage.clickOnMyAccountRegister();
        Assert.assertEquals(accountRegisterPage.getRegisterAccountText(), "Register Account", "Register page not displayed");
        accountRegisterPage.enterName("Gaura");
        accountRegisterPage.enterLastName("Patel");
        accountRegisterPage.enterEmailAddress("gp1234567@gmail.com");
        accountRegisterPage.enterTelephone("0201234567");
        accountRegisterPage.enterPassword("gp123456");
        accountRegisterPage.enterConfirmPassword("gp123456");
        accountRegisterPage.clickOnRadioButton("Yes");
        accountRegisterPage.clickOnPrivacyPolicyCheckBox();

        //Click on Continue button
        accountRegisterPage.clickOnContinueButton();

        //Click on My Account Link.

        //Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        //Verify the message “Account Logout”
        //Click on Continue button

    }
}