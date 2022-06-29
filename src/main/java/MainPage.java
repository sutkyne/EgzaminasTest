import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
    private WebElement clickRegister;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickLogin;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUsername;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//span[2]")
    private WebElement loginFailedMessage;



    public MainPage(WebDriver driver) {super(driver);}

    void clicksRegister(){clickRegister.click();}
    void clicksLogin(){clickLogin.click();}
    void putsUsernameExisting(){inputUsername.sendKeys("aaa");}
    void putsUsernameRandom(String username){inputUsername.sendKeys(username);}
    void putsPasswordExisting(){inputPassword.sendKeys("aaa");}
    void putsPasswordRandom(String password){inputPassword.sendKeys(password);}
    public boolean isMessageThere(){
        return loginFailedMessage.getText().equals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi");}
}
