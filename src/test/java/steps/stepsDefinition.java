package steps;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stepsDefinition extends BaseClass {

    WebDriver driver;

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        LoginPage.class
    }

    @Given("I enter email (.*)$")
    public void i_enter_email_email(String email) {
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys(email);
    }
    @Given("I enter password (.*)$")
    public void i_enter_password_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
    }
    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        assert driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[1]/img")).isDisplayed();
    }
}



