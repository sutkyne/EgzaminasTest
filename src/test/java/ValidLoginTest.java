import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidLoginTest extends BaseTest {

     MainPage mainPage = new MainPage(driver);
     UserPage userPage = new UserPage(driver);
     RegisterPage registerPage = new RegisterPage(driver);

    @Test
    public void UserCanRegisterValidData() {
        mainPage.putsUsernameExisting();
        mainPage.putsPasswordExisting();
        mainPage.clicksLogin();

        Assertions.assertTrue(userPage.logoutAndUserNameIsPresent("aaa"),"User is not created");


        
    }
}
