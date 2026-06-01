package steps;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    static WebDriver driver;

    @Before
    public void setup(){
        BrowserFactory browserFactory =  new BrowserFactory();
        driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/" );
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
