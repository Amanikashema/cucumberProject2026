package CucumberHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hook {
    WebDriver driver;

    @Before
    public void setup(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
