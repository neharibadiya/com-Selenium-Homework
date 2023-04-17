package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computerTab = driver.findElement(By.xpath("//a[@href='/computers']"));
        computerTab.click();
        String expectedTextDisplay = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicsTab = driver.findElement(By.xpath("//a[@href='/electronics']"));
        electronicsTab.click();
        String expectedTextDisplay = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelTab = driver.findElement(By.xpath("//a[@href='/apparel']"));
        apparelTab.click();
        String expectedTextDisplay = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownloadTab = driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
        digitalDownloadTab.click();
        String expectedTextDisplay = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement booksTab = driver.findElement(By.xpath("//a[@href='/books']"));
        booksTab.click();
        String expectedTextDisplay = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelryTab = driver.findElement(By.xpath("//a[@href='/jewelry']"));
        jewelryTab.click();
        String expectedTextDisplay = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCardsTab = driver.findElement(By.xpath("//a[@href='/gift-cards']"));
        giftCardsTab.click();
        String expectedTextDisplay = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Gift Cards')]"));
        String actualTextDisplay = actualTextElement.getText();
        Assert.assertEquals("Text is Display", expectedTextDisplay, actualTextDisplay);
    }

//    @After
//    public void tearDown() {
//        closeBrowser();
//    }
}
