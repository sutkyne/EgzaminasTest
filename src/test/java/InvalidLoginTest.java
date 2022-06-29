import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvalidLoginTest extends BaseTest {

     MainPage mainPage = new MainPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);

    @Test
    public void UserCanRegisterValidData() {
        mainPage.putsUsernameRandom(inValidUsername);
        mainPage.putsPasswordRandom(inValidPassword);
        mainPage.clicksLogin();
Assertions.assertTrue(mainPage.isMessageThere(), "Login validation failed");



    }
}
