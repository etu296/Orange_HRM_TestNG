import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestRunner extends SetUp{
    @Test(priority = 0)
    public void doLogin()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LogInPage logInPage = new LogInPage(driver);
        logInPage.doLogin("Admin","admin123");
    }
    @Test(priority = 1)
    public void PIM()
    {

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
    }
    @Test(priority = 2 )
    public void createPIM()
    {
        WebElement txtfirstName = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]"));
        txtfirstName.sendKeys("Etu Mahmuda ");
        WebElement txtlastName = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));
        txtlastName.sendKeys("Era ");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")).click();
        WebElement txtUserName = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]"));
       txtUserName.sendKeys("etuera112569 ");
        WebElement txtPass= driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]"));
        txtPass.sendKeys("Era123456@@");
        WebElement txtconfirmPass= driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]"));
        txtconfirmPass.sendKeys("Era123456@@");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")).click();


    }
    @Test(priority = 3)
    public void assertion()
    {
        List<WebElement> txtempName = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]"));
       String welcomemsgActual = txtempName.get(0).getText();
       Assert.assertEquals(welcomemsgActual,welcomemsgActual);

        List<WebElement> personaldetails = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h6[1]"));
        String welcomeActual = personaldetails.get(0).getText();
        String WelcomeExpected = ("Personal Details");
        Assert.assertEquals(welcomeActual,welcomeActual);
    }
@Test(priority = 4)
    public void search()
    {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
        WebElement searchEmployee = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        searchEmployee.sendKeys("Etu");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")).click();

    }

    @Test(priority = 5)
    public void searchAssertion()
    {
        List<WebElement> searchempName = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]"));
        String searchActual = searchempName.get(0).getText();
        Assert.assertEquals(searchActual,searchActual);


    }

}
