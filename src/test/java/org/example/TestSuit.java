package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage=new HomePage();
    RegistrationDetail registrationDetail=new RegistrationDetail();
    ClickOnRegisterButton clickOnRegisterButton=new ClickOnRegisterButton();
    RegistrationSuccessfully registrationSuccessfully=new RegistrationSuccessfully();
    MouseHoverAndConformation mouseHoverAndConformation=new MouseHoverAndConformation();
    AddComment addComment=new AddComment();
    //one of test case usershould be register successfully
    @Test
    public void UserShouldBeRegisterSuccessFully()
    {
        homePage.clickOnRegisterButton();
        registrationDetail.userEnterDetailOfRegistration();
        clickOnRegisterButton.userShoulBeClickOnRegidterButton();
        registrationSuccessfully.verifyUserShuoldBeRegisterSuccessfully();

    }
    @Test
    public void userShouldMouseHoveronComputerManuAndVerifyColorAfterHover()
    {
        mouseHoverAndConformation.usershouldBeConfrimAfterMouseHoverOnComputerItsColour();
    }
    @Test
    public void userShouldBeCommentOnNewRealeseAndConfrimThatCommentatLast()
    {
        homePage.clickOnNopcommerceNewRelease();
        addComment.userShouldBeEnterTheirsComment();
        addComment.compaircomment();
    }
}

