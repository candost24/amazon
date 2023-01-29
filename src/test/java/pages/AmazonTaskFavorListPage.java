package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AmazonTaskFavorListPage {
    private WebDriver driver;

    public AmazonTaskFavorListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "profile-list-name")
    private WebElement alisVerisName;
    public void verifyAlisVeris(){
        Assert.assertTrue(alisVerisName.isDisplayed());
    }
    @FindBy(name = "submit.deleteItem")
    private WebElement deleteItem;
    public void urunKaldir(){
        deleteItem.click();
    }

    @FindBy(xpath = "//div[.='Silindi']")
    private WebElement txtSilindi;

    public void verifySilindi(){
        Assert.assertTrue(txtSilindi.isDisplayed());
    }
    @FindBy(id = "nav-link-accountList")
    private WebElement hesapButton;

    @FindBy(xpath = "(//span[@class='nav-text'])[7]")
    private  WebElement cikisYap;

    public void logOutAccount(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hesapButton).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cikisYap)).click();
    }
}
