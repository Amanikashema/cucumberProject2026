package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@id='login-heading']")
    WebElement loginHeadingXpath;

    @FindBy(id = "login-email")
    WebElement email_Id;

    @FindBy(id = "login-password")
    WebElement password_Id;

    @FindBy(id = "login-submit")
    WebElement loginSubmit_Id;

    public void verifyLoginPageDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(visibilityOf(loginHeadingXpath));
        loginHeadingXpath.isDisplayed();
    }

    public void enterEmail(String email){
        email_Id.sendKeys(email);
    }

    public void enterPassword(String password){
        password_Id.sendKeys(password);
    }

    public void setLoginSubmit(){
        loginSubmit_Id.click();
    }
}
