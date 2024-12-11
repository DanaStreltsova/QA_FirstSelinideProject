package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class LoginStaps {

    HomePage home;
    LoginPage login;

    @And("User enters velid data")
    public void enters_velid_data(){
        login = Selenide.page(LoginPage.class);
        login.enterData("","");
    }

    @And("User clicks on Anmelden button")
    public void clicks_on_Anmelden(){
        login.clickOnAnmelden();
    }

//    @And("User click on User icon")
//    public void click_on_User_icon(){
//        home = Selenide.page(HomePage.class);
//        home.clickOnUserLogin();
//    }
//
//    @Then(" User verifies his name")
//    public void  verifies_his_name(){
//        login.verifyName("");
  //  }

    @And("User enters wrong email and valid password")
    public void enters_wrong_email_and_valid_password(){
        login = Selenide.page(LoginPage.class);
        login.enterInvalidEmailValidPassword("karina@gmcom","Karina!1234");
    }

    @Then("User verifies Error message is displayed")
    public void verify_Error(){
        login = Selenide.page(LoginPage.class);
        login.isMessageTextPresent();
    }

}
