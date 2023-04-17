package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        //find login link and click on login link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //verify the text Register
        String expectedTextDisplay = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //select gender radio button
        WebElement genderBtn = driver.findElement(By.xpath("//input[@id='gender-female']"));
        genderBtn.click();
        WebElement genderBtn1 = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderBtn1.click();
        //enter first name in first name field
        driver.findElement(By.id("FirstName")).sendKeys("Gautam");
        //enter last name in last name field
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //select day,month and year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("25");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("7");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2001");
        //Enter Email address in email field
        driver.findElement(By.id("Email")).sendKeys("gautampatel@gmail.com");
        //enter password in password field
        driver.findElement(By.id("Password")).sendKeys("gautamGP123");
        //enter confirm password in password field
        driver.findElement(By.id("ConfirmPassword")).sendKeys("gautamGP123");
        //click on register button
        WebElement registerBtn = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerBtn.click();
        //verify the text 'your registration completed
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedText,actualText);
    }
    //@After
    //public void tearDown() {
    //  closeBrowser();
    }
