import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InvalidRegisterTest extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);



    @Test
    @DisplayName("Tests if user can register using invalid data")
    public void userRegistrationInvalid(){

        mainPage.clicksRegister();

        registerPage.fillName(inValidUsername);

        registerPage.fillPassword(inValidPassword);

        registerPage.fillPasswordAgain(validPassword);

        registerPage.clicksSubmit();

        Assertions.assertTrue(registerPage.isAnyMessagePresent(),"No validation messages are present");

    }

}
