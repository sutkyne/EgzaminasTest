import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidRegisterTest extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    UserPage userPage = new UserPage(driver);


    @Test
    @DisplayName("Tests if user can register using valid data")
    public void userRegistrationValid() {


        mainPage.clicksRegister();

        registerPage.fillName(validUsername);

        registerPage.fillPassword(validPassword);

        registerPage.fillPasswordAgain(validPassword);

        registerPage.clicksSubmit();

        Assertions.assertTrue(userPage.logoutAndUserNameIsPresent(validUsername), "User is not created");

    }

}
