import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidLoggoutTest extends BaseTest {

     MainPage mainPage = new MainPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    UserPage userPage = new UserPage(driver);

    @Test
    public void UserCanRegisterValidData() {

        mainPage.clicksRegister();

        registerPage.fillName(validUsername);

        registerPage.fillPassword(validPassword);

        registerPage.fillPasswordAgain(validPassword);

        registerPage.clicksSubmit();

        userPage.clicksLogout();
        Assertions.assertEquals("http://localhost:8080/prisijungti?logout", driver.getCurrentUrl(), "Loggout unsuccessfull");




        
    }
}
