import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

    @FindBy(xpath = "(//a[@onclick=\"document.forms['logoutForm'].submit()\"])[1]")
    private WebElement clickLogout;

    public UserPage(WebDriver driver) { super(driver); }

    public void clicksLogout() { clickLogout.click(); }
    public boolean logoutAndUserNameIsPresent(String username){
        return clickLogout.getText().equals("Logout, "+username);
    }







}
