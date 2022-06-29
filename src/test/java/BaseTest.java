import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    public static WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");

    }

//    @AfterAll
//    static void tearDown() { driver.quit();}

    String validPassword = RandomStringUtils.random(3, true, true);
    String validUsername = RandomStringUtils.random(3, true, true);
    String inValidPassword = RandomStringUtils.random(2, true, true);
    String inValidUsername = RandomStringUtils.random(2, true, true);


}
