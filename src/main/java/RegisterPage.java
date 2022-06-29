import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id ="password")
    private WebElement inputPassword;

    @FindBy(id ="passwordConfirm")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickRegister;

    @FindBy(id = "username.errors")
    private WebElement messageUsername;
    @FindBy(id = "password.errors")
    private WebElement messagePassword;
    @FindBy(id = "passwordConfirm.errors")
    private WebElement messagePasswordsUneven;

    public RegisterPage(WebDriver driver) { super(driver); }

    public void fillName(String Name) {inputUsername.sendKeys(Name);}

    public void fillPassword(String value) { inputPassword.sendKeys(value);}

    public void fillPasswordAgain(String value) { confirmPassword.sendKeys(value);}

    public void clicksSubmit() { clickRegister.click();}

    public boolean isAnyMessagePresent(){

        return messageUsername.getText().equals("Privaloma įvesti nuo 3 iki 32 simbolių") ||
                messagePassword.getText().equals("Privaloma įvesti bent 3 simbolius") ||
                messagePasswordsUneven.getText().equals("Įvesti slaptažodžiai nesutampa");
    }
    }





