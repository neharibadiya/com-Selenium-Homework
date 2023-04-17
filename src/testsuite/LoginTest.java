package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the email Field Element
        driver.findElement(By.id("Email")).sendKeys("gautampatel@gmail.com");
        //find the password field element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("gautamGP123");
        //find the login btn element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
        loginBtn.click();
        String expectedTextDisplay = "Log out";
        WebElement actualTextElement = driver.findElement(By.xpath(("//li[@class='ico-logout']")));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is display", expectedTextDisplay, actualTextDisplay);
    }
    @Test
    public void verifyTheErrorMessage(){
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("prime123@gmail.com");
        //Find the Password Field Element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
