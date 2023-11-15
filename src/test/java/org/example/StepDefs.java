package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs
  {
      @Given("I am on nopcommerce home page")
      public void i_am_on_nopcommerce_home_page()
      {

      }
      @When("I Click on register button")
      public void i_click_on_register_button()
      {
        HomePage homePage=new HomePage();
         homePage.clickOnRegisterButton();
      }
      @And("I Enter Register detail")
      public void i_enter_register_detail()
      {
          RegistrationDetail registrationDetail=new RegistrationDetail();
          registrationDetail.userEnterDetailOfRegistration();

      }
      @Then("i press Click on register button")
      public void i_press_click_on_register_button()
      {
          ClickOnRegisterButton clickOnRegisterButton=new ClickOnRegisterButton();
          clickOnRegisterButton.userShoulBeClickOnRegidterButton();
      }
      @And("I should be register successfully")
      public void i_should_be_register_successfully()
      {
           RegistrationSuccessfully registrationSuccessfully=new RegistrationSuccessfully();
           registrationSuccessfully.verifyUserShuoldBeRegisterSuccessfully();

      }
      // comment add conformation steps

      @Given("As user i Want to click on Nopcommercr new realese detail")
      public void asUserIWantToClickOnNopcommercrNewRealeseDetail()
      {
          // create object of home page for calling relative method for this step
          HomePage homePage=new HomePage();
          homePage.clickOnNopcommerceNewRelease();
      }

      @When("I want to Add comment title and comment detail")
      public void iWantToAddCommentTitleAndCommentDetail()
      {
          // create object for clalling relative method for steps
          AddComment addComment=new AddComment();
          addComment.userShouldBeEnterTheirsComment();
      }



      @Then("I wnt to compair my comment title Add at last of comment list or not")
      public void iWntToCompairMyCommentTitleAddAtLastOfCommentListOrNot()
      {
          //create object for calling relative method for steps
          AddComment addComment=new AddComment();
          addComment.compaircomment();
      }
  }
