import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogInPage {

        @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
        WebElement txtUser;

       @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
       WebElement txtPass;

        @FindBy(css = "[type=submit]")
         WebElement txtbutton;

         public LogInPage(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
        }

        public void doLogin(String username, String password)
        {
            txtUser.sendKeys(username);
            txtPass.sendKeys(password);
            txtbutton.click();
        }

    }



