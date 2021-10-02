import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    SearchBox searchBox;
    By emailBox = By.id("LoginEmail");
    By passwordBox = By.id("Password");
    By loginButton= By.id("loginLink");

    public LoginPage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public void login(String email,String password)
    {
        type(emailBox , email);
        type(passwordBox , password);
        click(loginButton);
    }



}
